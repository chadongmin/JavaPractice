package makeBoardPractice;


public class AppMain {
    public static void main(String[] args) {

        Board board1 = new Board();

        //유저 정보 객체를 생성해서 생성자 파라미터로 유저이름, 유저 이메일을 넘긴다.
        UserInfo dongmin = new UserInfo("dongmin","cdm2883@naver.com");
        UserInfo minhee = new UserInfo("minhee","minhee@naver.com");

        //글 객체를 생성해서 생성자 파라미터로 유저 정보, 글 제목, 글 내용을 넘긴다
        Article article1   = new Article(dongmin, "자기소개","저는 차동민입니다.");
        //addArticle 메소드를 호출해서 글 생성
        board1.addArticle(article1);

        //댓글 객체를 생성한다. 생성자 파라미터로 유저 정보, 댓글 내용을 넘긴다.
        Comment commentByMinhee = new Comment(minhee,"우와 반갑습니다!!!");

        //addComment 메소드를 호출해서 댓글을 등록한다.
        article1.addComment(commentByMinhee);

        System.out.println(board1.findArticleByUserName("dongmin"));
        //작성한 글 내용 출력
        System.out.println(article1);

    }
}
