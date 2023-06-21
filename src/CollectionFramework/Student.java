package CollectionFramework;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Objects;

public class Student {
    private Long id;
    private String name;

    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id.equals(student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

class AppMain{
    public static void main(String[] args) {

        var hash = new HashMap<Student, String>();

        //중복되는 키값을 거르기 위해 student 객체에서 equals와 hashcode 메소드를 오버라이딩해서 검사한다.
        hash.put(new Student(1L, "kim"), "s_Kim");
        hash.put(new Student(1L, "kim"), "dddd");

        for (var s : hash.keySet()){
            System.out.println(s);
            System.out.println(hash.get(s));
        }



    }
}
