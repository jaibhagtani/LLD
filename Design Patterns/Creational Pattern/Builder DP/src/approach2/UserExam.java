package approach2;

import java.security.InvalidParameterException;

public class UserExam {

    private int englishNum;
    private int hindiNum;
    private String Name;

    private UserExam(){}

//    WHY we need static method
//    for documentation, we will say to use this getbuilder()
//    that will allow to create this parent class object
    public static UserExamBuilder getBuilder()
    {
        return new UserExamBuilder();
    }

    public static class UserExamBuilder {

        private int englishNum;
        private int hindiNum;
        private String Name;

        public int getEnglishNum() {
            return englishNum;
        }

        public UserExamBuilder setEnglishNum(int englishNum) {
            this.englishNum = englishNum;
            return this;
        }

        public int getHindiNum() {
            return hindiNum;
        }

        public UserExamBuilder setHindiNum(int hindiNum) {
            this.hindiNum = hindiNum;
            return this;
        }

        public String getName() {
            return Name;
        }

        public UserExamBuilder setName(String name) {
            this.Name = name;
//            this means return current object,
//            this is done for method chaining *******************
            return this;
        }

        //    validate and build
        public UserExam build()
        {
//        now validation
//            Step 1 : first validation
            if(this.englishNum > 100 || this.hindiNum > 100)
            {
                throw new InvalidParameterException();
            }
//            Step 2 :  Create an object
            UserExam ue = new UserExam();

            ue.englishNum = this.englishNum;
            ue.Name = this.Name;
            ue.hindiNum = this.hindiNum;

            return ue;
        }
    }

}


//A static class only means that you can acccess this class without creating an instance of that class.