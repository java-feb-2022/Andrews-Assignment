package Week2.BankAccount;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        System.out.println(account1.count);
        account1.Deposit(200.32, "savings");
        account1.Deposit(1000.53, "checking");
        account1.ShowSavings();
        account1.Withdraw(10.48, "savings");
        account1.Withdraw(985, "checking");
        account1.printTotal();
        BankAccount account2 = new BankAccount();
        System.out.println(account2.count);

    }
}
