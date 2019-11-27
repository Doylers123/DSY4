package ie.gmit.ds.representations;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class User {

    @NotNull
    private Integer id;
    @NotBlank @Length(min=2, max=255)
    private String UserName;
    private String Password;
    private String email;
    private String hashedPassword;
    private String salt;

    public User(Integer id, String userName, String passWord, String email) {
        this.id = id;
        this.UserName = userName;
        this.Password = passWord;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        this.UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", UserName=" + UserName + ", Password="
                + Password + ", email=" + email + " hashedPassword=" + hashedPassword + " salt=" + salt + "]";
    }


}