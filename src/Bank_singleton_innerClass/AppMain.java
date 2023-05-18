package Bank_singleton_innerClass;

public class AppMain {
    public static void main(String[] args) {

        Transaction tr = new Transaction();
        int accountNum1  = tr.openAccount(0);
        int accountNum2 = tr.openAccount(0);

        tr.deposit(accountNum1,1000);
        tr.deposit(accountNum2, 2000);
        tr.withdraw(accountNum1, 300);
        tr.getAccountHistory(accountNum1);

        tr.checkBalance(accountNum1);
        tr.checkBalance(accountNum2);

    }
}
