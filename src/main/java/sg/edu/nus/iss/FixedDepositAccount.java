package sg.edu.nus.iss;

public class FixedDepositAccount extends BankAccount {
    
    public static double interest =3.0;
    public static double duration = 6.0;

    public FixedDepositAccount(String accountNo, double balance) {
        super(accountNo, balance);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("No deposit operation");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("No withdrawal operation");
    }

    @Override
    public void showAccount() {
        System.out.println("Account No: " + this.getAccountNo());
        System.out.println("Full Name: " + this.getFullName());
        System.out.println("Balance: " + this.getBalance() * (100 + interest)/100);
    }
    
}
