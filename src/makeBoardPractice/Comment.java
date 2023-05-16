package makeBoardPractice;

import java.util.Date;

public class Comment {
    private UserInfo userInfo;
    private String contents;
    private Date writeDate;
    public Comment(UserInfo userInfo, String contents){
        this.userInfo = userInfo;
        this.contents = contents;
        this.writeDate = new Date();
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    @Override
    public String toString() {
        return "댓글{" +
                "작성자 정보=" + userInfo.getUserName()+ "|"+userInfo.getUserEmail() +
                ", 댓글 내용='" + contents + '\'' +
                ", 작성 일시=" + writeDate +
                '}';
    }
}
