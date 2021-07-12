package training;
public class BankAccount {
	
	int balance;
    public BankAccount(Integer initialBalance) {
    	
        balance = initialBalance;
	
    }
	
	
    // Add method to calculate
	
    // balance amount after withdrawal
	
    public Integer withdraw(Integer amount) {
	
        if (balance < amount) {
	
            throw new NotEnoughFundsException(amount, balance);
	
        }
	
        balance -= amount;
	
        return balance;
	
    }
	
}

class NotEnoughFundsException extends RuntimeException  {

    /**
 * 
 */
private static final long serialVersionUID = -5875825195209742382L;

	public NotEnoughFundsException(Integer amount, Integer balance) {
        super("Attempted to withdraw " + amount + " with a balance of " + balance);
    
}

}