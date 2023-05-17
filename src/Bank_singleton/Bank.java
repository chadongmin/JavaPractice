package Bank_singleton;

public class Bank {
    private static Bank INSTANCE;
    private static int ACCOUNT_NUM = 1;
    static {
        INSTANCE = new Bank();
    }

    private Account[] accounts = new Account[100];
    private int acccountIndex;

    private Bank(){}
    public static Bank getInstance(){
        return INSTANCE;
    }

    public Account openAccount(int value){
        Account account = new Account(ACCOUNT_NUM++, value);
        accounts[acccountIndex++] = account;
        return account;
    }

    public Account findAccount(int accountNum){
        for(var a: accounts){
            if(a.getAccountNum() == accountNum) return a;
        }
        return null;
    }

    public void deposit(int accountNum, int value){
        findAccount(accountNum).deposit(value);
    }
    public  void withdraw(int accountNum, int value){
        findAccount(accountNum).withdraw(value);
    }
    public void showAccountHistory(int accountNum){
        findAccount(accountNum).getAccountHistory();
    }

}
