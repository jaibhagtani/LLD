package inheritance;

public class User {
    String name;
    String email;
    String pass;

    void updateEmail(String newEmail){
        this.email = newEmail;
    }

    void changePass(String newPass){
        this.pass = newPass;
    }
}
