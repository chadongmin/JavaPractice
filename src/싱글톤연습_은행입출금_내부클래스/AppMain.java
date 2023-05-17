package 싱글톤연습_은행입출금_내부클래스;



public class AppMain {

    public static void main(String[] args) {

        int accountNum = Transaction.openAccount(0);
        Transaction.deposit(accountNum,1000);
        Transaction.withdraw(accountNum,500);
        Transaction.getMyAccountHistory(accountNum);

    }

}