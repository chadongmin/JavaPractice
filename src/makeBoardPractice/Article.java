package makeBoardPractice;


import java.util.Arrays;

public class Article {
    private UserInfo userInfo;
    private String contents;
    private String title;
    private Comment[] comments = new Comment[10];
    private int commentIndex;

    public Article(UserInfo userInfo, String title, String contents){
        this.userInfo = userInfo;
        this.title = title;
        this.contents = contents;
    }
    public void addComment(Comment comment){
        comments[commentIndex++] = comment;
    }

    public String getUserName() {
        return userInfo.getUserName();
    }
    public String getUserEmail() {
        return userInfo.getUserEmail();
    }

    public Comment[] getComments() {
        return comments;
    }
    public String getContents() { return contents;}

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "게시글 {\n" +
                "작성자 정보 =" + getUserName() +'|' +getUserEmail()+
                "\n글 내용 ='" + contents + '\'' +
                "\n글 제목 ='" + title + '\'' +
                "\n댓글 내용=" + Arrays.toString(getComments()) +
                '}';
    }
}
