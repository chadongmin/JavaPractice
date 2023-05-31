package Inheritance;

public class AppMain {
    public static void main(String[] args) {

        Person person = new Person();
        person.setPersonID("n1");

        person.setName("차동민");
        var goodsPrice = person.calMoney(10000);
        System.out.println(person+"할인가격은 : "+ goodsPrice);
        System.out.println("========================");
        RoyalPerson rPerson = new RoyalPerson();
        rPerson.setPersonID("n2");
        rPerson.setName("강민희");
        goodsPrice = rPerson.calRoyalMoney(10000);
        System.out.println(rPerson+"로얄고객 할인가격은 : "+goodsPrice);
    }
}
