package Bank_singleton_innerClass;

public class Bank {

    //Bank클래스의 인스턴스를 단 하나만 생성하도록 싱글톤으로 구현
    private static Bank INSTANCE;
    private static int ACCOUNT_NUM = 1;
    private Account[] accounts = new Account[3];
    private int accountIndex;

    //외부에서 인스턴스 생성 못하도록 기본 생성자
    //private으로 접근 제한함
    private Bank(){}
    static{
        INSTANCE = new Bank();
    }

    //오직 getInstance 메소드로만
    //인스턴스 리턴받을 수 있도록 함.
    public static Bank getInstance(){
        return INSTANCE;
    }
    public int openAccount(int value){
        Account account = new Account(ACCOUNT_NUM++, value);
        accounts[accountIndex++] = account;
        return account.getAccountNum();
    }
    public Account findAccount(int accountNum){
        for(var a: accounts){
            if(a.accountNum == accountNum)
                return a;
        }
        return null;
    }
    public void deposit(int ACCOUNT_NUM, int value){
        findAccount(ACCOUNT_NUM).deposit(value);

    }
    public void withdraw(int ACCOUNT_NUM, int value){
        findAccount(ACCOUNT_NUM).withdraw(value);
    }
    public void showAcccountHistory(int ACCOUNT_NUM){
        findAccount(ACCOUNT_NUM).getHistory();
    }
    public void checkMyBalance(int ACCOUNT_NUM){
        System.out.println("계좌번호: "+ACCOUNT_NUM+" 의 잔고는 "+findAccount(ACCOUNT_NUM).getBalance()+"원 입니다.");
    }

    private class Account{
        private int accountNum;
        private int balance;
        private String[] history = new String[5];
        private int historyIndex;

        //처음 계좌를 만드는 생성자 함수
        //파라미터로 넘긴 계좌번호와 초기 잔고를
        //클래스 멤버변수에 할당한다.
        private Account(int accountNum, int firstBalance){
            this.accountNum = accountNum;
            this.balance = firstBalance;
        }
        private void deposit(int value){
            balance+=value;
            history[historyIndex++] = value+"원 입금"+"| 현재 잔액 : "+getBalance();
        }
        private void withdraw(int value){
            balance-=value;
            history[historyIndex++] = value+"원 출금"+"| 현재 잔액 : "+getBalance();
        }

        private int getBalance() {
            return balance;
        }
        private int getAccountNum(){
            return accountNum;
        }

        private String[] getHistory() {
            for(var h : history){
                if(h!= null){
                    System.out.println(h);
                }
            }
            return null;
        }
    }
}
