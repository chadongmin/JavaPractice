package ch0510;

public class AppMain {
    public static void main(String[] args) {

        BirthInfo birthInfo = new BirthInfo();
        birthInfo.setBirthInfo(10, 6);

        System.out.println(birthInfo.getBirthInfo());
//---------------------------------------------------------//
        //유효하지 않은 생일 입력
        BirthInfo birthInfo1 = new BirthInfo();
        birthInfo1.setBirthInfo(13,-2);

        System.out.println(birthInfo1.getBirthInfo());
    }
}
