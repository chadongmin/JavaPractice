package ch0511;

public class StringTest {

    public static void main(String[] args) {
//        String str = "Daegu";
//        str = str + " univ";
//        System.out.println(str.hashCode());
        StringBuffer sb = new StringBuffer();
        sb.append("Daegu");
        sb.append(" univ");

        //메모리 주소값을 출력해보면 왜 StringBuffer를 사용하는지 알 수 있다.
        // + 연산자로 str을 이어붙이면 메모리가 각각 다른 곳을 가리켜서 메모리가 샌다.
    }
}
