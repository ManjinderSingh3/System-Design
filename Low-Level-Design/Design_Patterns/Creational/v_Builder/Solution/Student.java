package Design_Patterns.Creational.v_Builder.Solution;
import java.util.List;

public class Student {
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

    Student(StudentBuilder studentBuilder){
        this.rollNumber = studentBuilder.rollNumber;
    }
}
