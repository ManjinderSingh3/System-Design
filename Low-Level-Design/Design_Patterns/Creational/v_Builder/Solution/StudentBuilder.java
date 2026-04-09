package Design_Patterns.Creational.v_Builder.Solution;

import java.util.List;

public abstract class StudentBuilder {
    //Mandatory fields
    int rollNumber;
    int age;
    String name;
    String branch;

    // Optional fields
    String fatherName;
    String motherName;
    List<String> subjects;
    String mobileNo;
    String emailId;

    public StudentBuilder setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
        return this;
    }
}
