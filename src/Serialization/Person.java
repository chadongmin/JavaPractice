package Serialization;

import java.io.*;

public class Person implements Serializable {
    private String name;
    private transient String job; //transient : 직렬화 제외 키워드

    //직렬화객체는 기본생성자가 필요
    public Person(){}
    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }
    /*
     Setter and Getter for Serialization
    * */
    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}

class AppUI{
    public static void main(String[] args) {
        var person1 = new Person("cha", "Developer");
        var person2 = new Person("kim", "singer");

        //1. Object Write End
        try(var oos = new ObjectOutputStream(new FileOutputStream("person_serial.out"))) {
            oos.writeObject(person1);
            oos.writeObject(person2);
        }catch (Exception e){
            e.printStackTrace();
        }
        //2. Object Read
        try(var ois = new ObjectInputStream(new FileInputStream("person_serial.out"))){
            Person p1 = (Person)ois.readObject();
            System.out.println(p1);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
