package ch0515;

import java.util.Date;

public class Gallery {
    private Long galleryId;
    private UserInfo userInfo;
    private String title;
    private String contents;
    private Date writeDate;
    private Comment[] comments = new Comment[2];
    private int CommentIndex;

    public Gallery(UserInfo userInfo, String title, String contents){
        this.userInfo = userInfo;
        this.title  = title;
        this.contents = contents;
        this.writeDate = new Date();
    }
    public void addComment(Comment comment){
        comments[CommentIndex++] = comment;

    }
    public void setGalleryId(Long galleryId){
        this.galleryId = galleryId;
    }
    public Comment[] getComments(){
        return comments;
    }
    public String writeEmail(){
        return userInfo.getEmail();
    }

    @Override
    public String toString() {
        return "Gallery{" +
                "galleryId=" + galleryId +
                ", userInfo=" + userInfo +
                ", title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                ", writeDate=" + writeDate +
                '}';
    }
}
