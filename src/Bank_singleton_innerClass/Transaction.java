package Bank_singleton_innerClass;

public class Transaction {
    Bank bank = Bank.getInstance();
    public int openAccount(int firstBalance){
        return bank.openAccount(firstBalance);

    }
    public void deposit(int accountNum, int value){
        bank.deposit(accountNum, value);
    }
    public void withdraw(int accountNum, int value){
        bank.withdraw(accountNum, value);
    }
    public void checkBalance(int accountNum){
        bank.checkMyBalance(accountNum);
    }
    public void getAccountHistory(int accountNum){
        bank.showAcccountHistory(accountNum);
    }

}
