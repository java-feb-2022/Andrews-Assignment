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

    public void printTotal() {
        double total = checkingBalance + savingsBalance;
        System.out.println(total);
    }

    public void ShowSavings() {
        System.out.println(this.savingsBalance);
    }

    public void ShowChecking() {
        System.out.print(this.checkingBalance);
    }

    public void Deposit(double amount, String accType){
        if (accType.equals("checking")) {
            checkingBalance += amount;
            System.out.println(checkingBalance);
        }
        else if(accType.equals("savings")) {
            savingsBalance += amount;
            System.out.println(savingsBalance);
        }
        else {
            System.out.println("Invalid Account Type");
        }
    }

    public void Withdraw(double amount, String accType) {
        if (accType.equals("checking") && checkingBalance > amount) {
            checkingBalance -= amount;
            System.out.println(checkingBalance);
        }
        else if(accType.equals("savings") && savingsBalance > amount) {
            savingsBalance -= amount;
            System.out.println(savingsBalance);
        }
        else {
            System.out.println("Invalid Account Type or Insufficient Funds");
        }
    }


}
