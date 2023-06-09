package Bank_singleton;

public class Transaction {


    public static int openAccount(int firtstBalance){
        Bank bank = Bank.getInstance();
        bank.openAccount(firtstBalance);
        return bank.openAccount(firtstBalance).getAccountNum();
    }

    public static void deposit(int accountNum,int value){
        Bank bank = Bank.getInstance();
        bank.deposit(accountNum, value);
    }
    public static void withdraw(int accountNum,int value){
        Bank bank = Bank.getInstance();
        bank.withdraw(accountNum, value);
    }
    public static void getMyAccountHistory(int accountNum){
        Bank bank = Bank.getInstance();
        bank.showAccountHistory(accountNum);
    }
}
