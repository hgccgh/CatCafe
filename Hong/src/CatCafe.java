import java.lang.*;
public interface CatCafe {
     void purchase(String name,double price) throws InsufficientBalanceException;
    void treat(String... customer);
     void rest();
}
