package ch0510_2;
public class BmiCheck {
    private double height;
    private double weight;
    private double BmiResult;

    public BmiCheck(String height, String weight){
        this(Double.parseDouble(height), Double.parseDouble(weight));
    }

    private BmiCheck(double height, double weight){
        this.height = height;
        this.weight = weight;

        this.BmiResult = weight / (height * height);

    }

    public double getBmiResult() {
        System.out.printf("%s %.2f","BMI수치 :",BmiResult*10000);
        return BmiResult;
    }
}
 