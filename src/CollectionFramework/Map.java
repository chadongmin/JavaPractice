package CollectionFramework;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();

        hm.put("1", "1V");
        hm.put("2", "2V");
        hm.put("2", "3V");

        //System.out.println(hm.get("2"));
        //entrySet메소드 사용해서 키값 밸류값을 따로 받아올 수 있다.
        for (var en : hm.entrySet()){
            System.out.println(en.getKey());
            System.out.println(en.getValue());
        }

    }
}
