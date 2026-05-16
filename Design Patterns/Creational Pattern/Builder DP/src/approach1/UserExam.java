package approach1;

import java.security.InvalidParameterException;

public class UserExam {

    private int englishNum;
    private int hindiNum;
    private String Name;

    UserExam(UserExamParameters usp){

//        now validation
        if(usp.englishNum > 100 || usp.hindiNum > 100)
        {
            throw new InvalidParameterException();
        }
        this.englishNum = usp.englishNum;
        this.hindiNum = usp.hindiNum;
        this.Name = usp.Name;
    }
    UserExam(){}
}
