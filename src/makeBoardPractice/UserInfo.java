package makeBoardPractice;

public class UserInfo {
    private String userName;
    private String userEmail;
    public UserInfo(String userName, String userEmail){
        this.userName = userName;
        this.userEmail = userEmail;
    }


    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }
}
