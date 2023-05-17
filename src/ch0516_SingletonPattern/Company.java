package ch0516_SingletonPattern;

public class Company {
    private static Company INSTANCE;
    static{
        INSTANCE = new Company();
    }

    private String name;

    private Company(){} //외부에서 쓰지 못하게 기본 생성자 private으로 선언

    public static Company getInstance(){
        return INSTANCE;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name){
        this.name = name;
    }

}

//class AppMain{
//    public static void main(String[] args) {
//        Company company1 = Company.getInstance();
//        Company company2 = Company.getInstance(); //company1과 company2가 같은 메모리 주소를 바라보고 있다. call by reference!
//
//        System.out.println(company1.hashCode());
//        System.out.println(company2.hashCode());
//    }
//}
