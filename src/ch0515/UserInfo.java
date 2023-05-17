package ch0515;

public class UserInfo {
    private String email;
    private String name;

    public UserInfo(String email, String name){
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
