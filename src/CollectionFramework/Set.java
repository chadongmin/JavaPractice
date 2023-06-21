package CollectionFramework;

import java.util.*;

public class Set {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("1");
        hs.add("2");
        hs.add("3");

        //iterator를 활용하여 순회할 수 있다.
        Iterator<String> it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("hs = " + hs);


        // Comparator Interface를 익명클래스로 구현해서 compare함수를 오버라이딩해서 역순으로 구현 가능
        // 오버라이딩을 하나만 한다면 익명클래스 써도 된다.

        TreeSet<String>ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2) * -1;
                //return 값이 음수가 나오면 역순임
            }
        });
        ts.add("a");
        ts.add("b");
        ts.add("c");

        System.out.println("ts = " + ts);
    }
}
