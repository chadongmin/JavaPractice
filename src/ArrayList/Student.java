package ArrayList;


import java.util.ArrayList;

public class Student {

    ArrayList<Subject> arr = new ArrayList<>();
    private String name;
    private static int stdNum = 10000;

    public Student(String name){
        this.name = name;
        this.stdNum++;
    }
    public Subject addSubject(String name, int score){
        Subject subject = new Subject(name, score);
        arr.add(subject);

        return null;
    }
    public Subject showMyScore(){
        System.out.println("이름 : "+getName()+"| 학번: "+ getStdNum());
        for(var s : arr){
            System.out.println("과목 : "+s.getName()+"| 점수 : "+s.getScore());
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public int getStdNum() {
        return stdNum;
    }

    private class Subject{
        private String name;
        private int score ;

        private Subject(){}
        private Subject(String name, int score){
            this.name = name;
            this.score = score;
        }

        private String getName() {
            return name;
        }

        private int getScore() {
            return score;
        }
    }

}
