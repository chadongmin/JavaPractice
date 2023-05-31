package Inheritance;

public enum PersonGrade {
    GRADE_A(0.05, 0.05),
    GRADE_B(0.0,0.01);
    private double salesRatio;
    private double bonusRatio;

    public double getSalesRatio() {
        return salesRatio;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    private PersonGrade(double salesRatio, double bonusRatio){
        this.bonusRatio = bonusRatio;
        this.salesRatio = salesRatio;
        System.out.println("로얄 생성자");
    }
}
