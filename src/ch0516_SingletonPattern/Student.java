package ch0516_SingletonPattern;

public class Student {
    private static Student INSTANCE = new Student();

    private Student(){}

    public static Student getInstance(){
        return INSTANCE;
    }


}
