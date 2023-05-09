package ch0509;

import ch0509.constants.Constants;

public class AppMain{
    public static void main(String[] args) {

        Student student = new Student("kevin");
        Subject koreanSubject = new Subject("국어",99,Constants.KOREA_CODE);
        Subject mathSubject = new Subject("수학",79,Constants.MATH_CODE);

        student.addSubject(koreanSubject);
        student.addSubject(mathSubject);

        System.out.println(student.printAllScore());
        
    }
}
