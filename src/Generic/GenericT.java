package Generic;

import java.util.ArrayList;

class MyGeneric<T>{
    T obj;
    void add(T obj){
        this.obj = obj;
    }
    T get(){
        return this.obj;
    }
}

public class GenericT {
    public static void main(String[] args) {

         MyGeneric<Integer> myGen = new MyGeneric<>();
         myGen.add(1);
         System.out.println("myGen = " + myGen.get());

         MyGeneric<String> myGen2 = new MyGeneric<>();
         myGen2.add("dongmin");
         System.out.println("myGen2 = " + myGen2.get());

         ArrayList<MyGeneric> arr = new ArrayList<>();
         arr.add(myGen);
         arr.add(myGen2);
    }
}
