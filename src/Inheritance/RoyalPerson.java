package Inheritance;

public class RoyalPerson extends Person{

    public RoyalPerson(){
        //super()키워드는 컴파일러가 붙여준다. 즉 부모의 default 생성자를 먼저 호출하고
        //자신의 생성자를 호출한다.
        //super();
        grade = PersonGrade.GRADE_A;
    }

    public int calRoyalMoney(int price){
        bonusPoint += price * grade.getBonusRatio();
        int dcPrice = (int)(price * grade.getSalesRatio());
        price -= dcPrice;
        return price;
    }

}
