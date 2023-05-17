package ch0508;

public class AppMain {
    public static void main(String[] args) {
        SearchService searchService = new SearchService();

        Member member = searchService.findMember("messi");
        if(member != null){
            System.out.println(member.name);
            System.out.println(member.height);
            System.out.println(member.weight);
        }
        /*Member memberInfoTest = new Member();
        System.out.println(memberInfoTest.name);*/
    }
}
