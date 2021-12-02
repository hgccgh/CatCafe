public class BlackCat extends Cat{
    String name="Black";
    int age=1;
    String sex="雌性";
    double price=350;
    boolean isFat;

    public BlackCat(String name, int age, String sex, double price,boolean isFat) {
        super(name, age, sex, price);
        this.isFat=isFat;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }

    @Override
    public String toString(){
    return "猫的名字为："+name+",年龄为："+age+",性别为:"+sex+",价格为："+price+",是否肥胖:"+isFat;
}


}
