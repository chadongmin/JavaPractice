package Bank_singleton;

public class Account{
    private int accountNum;
    private int balance;
    private String[] history = new String[2];
    private int historyIndex;

    //잔액 조회를 위해 AppMain에서 생성자를 통해 Account클래스로 접근하기 위해 기본생성자 생성
    public Account(){}

    public Account(int accountNum, int balance){
        this.accountNum = accountNum;
        this.balance = balance;

    }
    public int deposit(int value){
        balance += value;
        history[historyIndex++] = value + "원 입금";
        return balance;
    }
    public int withdraw(int value){
        balance -= value;
        history[historyIndex++] = value + "원 출금";
        return balance;
    }

    public int getBalance() {
        return balance;
    }

    public void getAccountHistory(){
//        for(int i = 0 ;i<history.length;i++){
//            System.out.println(history[i]);
//        }
        for(var a: history){
            if(a!=null){
                System.out.println(a+" | 잔고 :"+getBalance()+"원");
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
