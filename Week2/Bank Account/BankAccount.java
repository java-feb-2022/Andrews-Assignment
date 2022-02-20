public class BankAccount {

    public static int count = 0;
    public static double totalBalance = 0;

    private double checkingBalance;
    private double savingsBalance;


    public BankAccount() {
        BankAccount.count ++;
        this.checkingBalance = 0;
        this.savingsBalance = 0;
    }

    public double ShowSavings() {
        return this.savingsBalance;
    }

    public double ShowChecking() {
        return this.checkingBalance;
    }

    public void Deposit(){
        
    }

    public void Withdraw() {
        
    }


}
