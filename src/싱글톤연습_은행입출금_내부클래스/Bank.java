package 싱글톤연습_은행입출금_내부클래스;

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

    class Account{
        private int accountNum;
        private int balance;
        private String[] history = new String[2];
        private int historyIndex;

        private Account(int accountNum, int balance){
            this.accountNum = accountNum;
            this.balance = balance;

        }
        private int deposit(int value){
            balance += value;
            history[historyIndex++] = value + "원 입금"+"|잔고 : "+getBalance()+"원";
            return balance;
        }
        private int withdraw(int value){
            balance -= value;
            history[historyIndex++] = value + "원 출금"+"|잔고 : "+getBalance()+"원";
            return balance;
        }

        private int getBalance() {
            return balance;
        }

        private void getAccountHistory(){
//        for(int i = 0 ;i<history.length;i++){
//            System.out.println(history[i]);
//        }
            for(var a: history){
                if(a!=null){
                    System.out.println(a);
                }
                else if (history[0]==(null)){
                    System.out.println("입출금 내역이 존재하지 않습니다.");
                    break;
                }
            }

        }
        public int getAccountNum() {
            return accountNum;
        }
    }

}

