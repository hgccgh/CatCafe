
import java.util.Random;
public class MyCatCafe implements CatCafe{

    double remain;
   int ruaTimes;
    int ruaTime;
    public void purchase(String name,double price) throws InsufficientBalanceException{
        InsufficientBalanceException insufficientBalanceException=new InsufficientBalanceException(600);
        remain=insufficientBalanceException.getAmount();
if(remain>=price) {
    System.out.println("购买成功");
}else{
    double needs = remain-price;
    System.out.println("余额不足，无法购买，还差"+(-needs)+"元");
    throw new InsufficientBalanceException(needs);
}

    }
    public void treat(String... customer)throws CatNotFoundException {
        int ruaTimes;
        InsufficientBalanceException insufficientBalanceException = new InsufficientBalanceException(600);
        remain = insufficientBalanceException.getAmount();
        Random random = new Random();
        OrangeCat orangeCat = new OrangeCat("orange", 1, "雄性,", 200, true);
        BlackCat blackCat = new BlackCat("black", 1, "雌性,", 350, true);
        ruaTimes = random.nextInt(4) + 1;
        ruaTime = random.nextInt(2);
        orangeCat.setPrice(200);
        if (remain >= orangeCat.getPrice()) {
            remain = remain - orangeCat.getPrice();
            if (ruaTimes == 1) {
                if (ruaTime == 0) {
                    System.out.println("rua了橘猫");
                    System.out.println(orangeCat);
                }
            }
        }else {
            throw new CatNotFoundException(ruaTimes);
        }
        blackCat.setPrice(350);
        if (remain >= blackCat.getPrice()) {
            remain = remain - blackCat.getPrice();
            if (ruaTime == 1) {
                System.out.println("rua了黑猫");
                System.out.println(blackCat);
            }
            if (ruaTimes == 2) {
                System.out.println("两只猫都rua了");
                System.out.println(orangeCat);
                System.out.println(blackCat);
            }
            if (ruaTimes > 2) {
                System.out.println("rua到重复的猫了");
                System.out.println(orangeCat);
                System.out.println(blackCat);
            }

        }
        this.ruaTimes = ruaTimes;
        remain += 15*(ruaTimes+(ruaTimes+1));
        System.out.println("店内余额为:" + remain);
    }


    public void rest(){
        Customer customer=new Customer("小明",2);
        customer.rua=ruaTimes;
        Customer customer1=new Customer("小红",3);
        customer1.rua=ruaTimes+1;
        System.out.println(customer);
        System.out.println("实际rua猫次数:"+customer.rua);
        System.out.println(customer1);
        System.out.println("实际rua猫次数:"+customer1.rua);
        System.out.println("今日利润为:"+15*(customer.rua+customer1.rua));
    }
}
