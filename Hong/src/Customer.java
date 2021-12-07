import java.time.LocalDate;
public class Customer {
    String name;
    int wantRua;
    int rua;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWantRua(int wantRua) {
        this.wantRua = wantRua;
    }

    public int getWantRua() {
        return wantRua;
    }

    public void setRua(int rua) {
        this.rua = rua;
    }

    public int getRua() {
        return rua;
    }

    LocalDate localDate=LocalDate.now();
public Customer(String name,int wantRua){
this.name=name;
this.wantRua=wantRua;
}
    @Override
    public String toString(){
        return "顾客姓名:"+name+",想rua猫次数:"+wantRua+",到店时间:"+localDate;
    }
}






