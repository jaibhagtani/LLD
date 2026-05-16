package polymorphism;

import java.util.List;

public class Main {

//Now all Users are allow -> where student, TA => Polymorphism
    static void changePassOfAllUsers(List<User> ul) {

        for(User u : ul){
//            at runtime, we know exact datatype -> therefore can operate it
            if(u instanceof Student){
//                type cast and then use it
//                this is at run time
                Student st = (Student) u;
//                now why compiler is allowing to call this
//                because type casted
                st.changeEmail();
            }
        }
    }
    static void main() {
//        Polymorphism allow us to refer to exact data types via umbrella type
//        for compiler, user object is of User type

//        At runtime, we can get exact data types
        User user = new TA();

//        user.ta = "vdkvmd"; Throw Error
        User user1 = new Student();
        User user2 = new Mentor();
        User user3 = new User();

//        Now because of polymorphism
//        I have list of User -> but I can pass all user
        List<User> ul = List.of(
                user,
                user1,
                user2,
                user3,
                new Student(),
                new TA()
        );
    }
}
