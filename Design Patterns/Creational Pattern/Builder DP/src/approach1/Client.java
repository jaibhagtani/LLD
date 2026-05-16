package approach1;

public class Client {

    static void main() {
        UserExamParameters usp = new UserExamParameters();
        usp.englishNum = 190;
        usp.hindiNum = 20;
        usp.Name = "name";

        UserExam ue;
        try {
            ue = new UserExam(usp);
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }


//        setting values by getters and setters
//        We are not doing this, since our usecase is validating also
//        UserExam ue2 = new UserExam();

    }
}
