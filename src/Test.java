import java.util.ArrayList;

public class Test {
        public static void main(String[] args) {
            MyCatCafe myCatCafe=new MyCatCafe();

            ArrayList<String> restock =new ArrayList<>();

            try {
                new MyCatCafe().purchase("OrangeCat",200);
                restock.add("OrangeCat");
            } catch (InsufficientBalanceException e) {
                e.printStackTrace();
                System.out.println("余额不足，无法购买OrangeCat,还差"+-e.getAmount());
            }


            try {
                new MyCatCafe().purchase("BlackCat",350);
                restock.add("BlackCat");
            } catch (InsufficientBalanceException e) {
                e.printStackTrace();
                System.out.println("余额不足，无法购买BlackCat,还差"+-e.getAmount());
            }
            System.out.println("所购买的猫的种类为:"+restock);
            ArrayList<Customer> memory =new ArrayList<>();
            Customer customer=new Customer("小明",2);
            Customer customer1=new Customer("小红",3);
            memory.add(customer);
            memory.add(customer1);
            myCatCafe.treat("小明","小红");
            System.out.println("今日所到访的顾客信息:"+memory);
            myCatCafe.rest();
        }

}
