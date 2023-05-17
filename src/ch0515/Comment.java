package ch0515;

import java.util.Date;

public class Comment {
    private String conttents;
    private Date writeDate;
    private UserInfo userInfo;

    public Comment(UserInfo userInfo, String conttents){
        this.userInfo = userInfo;
        this.conttents = conttents;
        writeDate = new Date();
    }
    public String writeUser(){
        return userInfo.getEmail();
    }


}
