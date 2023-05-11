package ch0511;

public class MakePrint {
    private String line = "-----------------\n";
    private String title = "이름\t    주소\t    전화번호\t\n";

    private StringBuffer buffer = new StringBuffer();
    private void makeHeader(){
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
        //String을 조합할때 + 연산자를 쓰면 메모리가 계속 새기 때문에
        //StringBuffer를 사용해서 효율적으로 사용한다.
    }
    private void makeBody(){
        buffer.append("james \t");
        buffer.append("korea \t");
        buffer.append("010-1111-2222\n");
    }
    private void makeTail(){
        buffer.append(line);
    }
    public String makePrint(String companyName){
        if(companyName.equals("ABC")){
            makeHeader();
            makeBody();
            makeTail();
            return buffer.toString();
        }
        return null;
    }
}
