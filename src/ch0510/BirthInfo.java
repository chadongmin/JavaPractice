package ch0510;

public class BirthInfo {

    private int month;
    private int day;

    public String getBirthInfo() {
        return month +"월"+ day+"일";
    }


    public void setBirthInfo(int month, int day) {

        if ((month > 0 && month < 13) && (day >  0 && day < 32)){
            this.month = month;
            this.day = day;

        }
        else System.out.println("유효하지 않은 양식의 생일을 입력헀습니다.");

    }
}
