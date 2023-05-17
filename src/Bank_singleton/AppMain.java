package Bank_singleton;

public class AppMain {

    public static void main(String[] args) {
        Account ac = new Account();
        int accountNum = Transaction.openAccount(500);
        Transaction.deposit(accountNum,1000);
        Transaction.withdraw(accountNum,500);
        Transaction.getMyAccountHistory(accountNum);
        /*
        * 싱글톤 패턴으로 Bank 인스턴스로 static으로 접근해서 그런지
        * getMyAccount에서 잔고 조회 기능을 같이 넣으려고 하니까
        * 마지막 최종 잔고로 모든 잔고가 덮어씌워지는 현상이 발생함
        * 싱글톤 패턴의 문제점인듯 싶다..........................
        * */
        //System.out.println(ac.getBalance());
    }

}
