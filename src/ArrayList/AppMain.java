package ArrayList;

import java.util.ArrayList;

public class AppMain {
    public static void main(String[] args) {

        Student dongmin = new Student("차동민");
        dongmin.addSubject("국어",100);
        dongmin.addSubject("수학",80);
        dongmin.showMyScore();

        Student minhee = new Student("강민희");
        minhee.addSubject("국어",100);
        minhee.addSubject("수학",100);
        minhee.showMyScore();









    }
}
