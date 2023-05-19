package ch0509;

class Subject {
    String name;
    int score;
    String subjectCode;
    Subject(){}
    public Subject(String name, int score, String subjectCode){
        this.name = name;
        this.score = score;
        this.subjectCode = subjectCode;
    }


    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", subjectCode='" + subjectCode + '\'' +
                '}';
    }
}
public class Student{
    String name;
    Subject[] subjects = new Subject[2];
    int subjectIndex;
    Student(){}
    public Student(String name){
        this.name = name;
    }

    public void addSubject(Subject subject){ //파라미터로 객체를 넘겨서 외부에서 정보를 주입시킬 수 있도록 한다.
        subjects[subjectIndex++] = subject;
    }

    public void mySubjectInfo(){
        for(var s : subjects) System.out.println(s);
    }

    public String printAllScore(){
        int sum = 0;
        Subject sub = new Subject();

        for(int i = 0; i < subjects.length; i++ ){
            sum+= subjects[i].score;
        }
        return "모든 과목의 평균 점수는 " + sum/subjects.length + "점 입니다.";

    }


}
