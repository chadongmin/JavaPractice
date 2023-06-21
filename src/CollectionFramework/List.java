package CollectionFramework;

import java.util.*;

public class List {
    public static void main(String[] args) {

        //List
        //case1 : ArrayList
        var arr = new ArrayList<String>();
        arr.add("1");
        arr.add("2");
        arr.add("2");
        
        for (var a : arr){
            System.out.println(a);
        }

        //case2 : LinkedList
        var linked = new LinkedList<String>();
        linked.add("1");
        linked.add("2");
        linked.add("2");

        for (var a : linked){
            System.out.println(a);
        }

        //case 3 : Stack

        var stack = new Stack<String>();
        stack.push("1");
        stack.push("2");

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        //case 4 : queue®
        //자바에서 큐는 인터페이스가 구현되어 있지 않아서 LinkedList로 사용해야한다.
        Queue queue = new LinkedList<String>();
        queue.add("1");
        queue.offer("2");



    }
}
