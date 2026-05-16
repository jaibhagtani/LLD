package approach2;

import approach2.UserExam;

public class Client {

    static void main() {


        try {

//        UserExam.UserExamBuilder ueb = UserExam.getBuilder();
//        ueb.setName("Name");
//        ueb.setHindiNum(9);
//        ueb.setEnglishNum(90);
//
//        UserExam ue = ueb.build();

//        This is not looking good
//        We want to do METHOD CHAINING =>

//        I want in this format
        UserExam ue = UserExam.getBuilder()
                .setEnglishNum(90)
                .setHindiNum(9)
                .build();

//        This is method chaining
        }
        catch (Exception ex)
        {

        }
    }

}
