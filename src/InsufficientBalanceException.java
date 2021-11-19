
public class InsufficientBalanceException extends RuntimeException{
         double amount;
        public InsufficientBalanceException(double amount)
        {
            this.amount = amount;
        }
        public double getAmount()
        {
            return amount;
        }


}
