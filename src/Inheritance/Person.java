package Inheritance;

public class Person {
    protected String PersonID;
    protected String name;
    protected PersonGrade grade;
    protected int bonusPoint;

    public Person(){
        grade = PersonGrade.GRADE_B;
        System.out.println("펄슨 생성자");
    }

    public String getPersonID() {
        return PersonID;
    }

    public void setPersonID(String personID) {
        PersonID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonGrade getGrade() {
        return grade;
    }

    public void setGrade(PersonGrade grade) {
        this.grade = grade;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }
    public int calMoney(int price) {
        bonusPoint += price * grade.getBonusRatio();
        if (grade.getSalesRatio() > 0.0) {
            int dcPrice = (int)(price * grade.getSalesRatio());
            price -= dcPrice;
            return price;
        }
        else{

            return price;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "PersonID='" + PersonID + '\'' +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", bonusPoint=" + bonusPoint +
                '}';
    }
}
