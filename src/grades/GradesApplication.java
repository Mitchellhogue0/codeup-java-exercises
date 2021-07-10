package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication{


    public static void main(String[] args) {
        Student mitchell = new Student("mitchell", null);
        mitchell.addGrade(95);
        mitchell.addGrade(100);
        mitchell.addGrade(90);
        System.out.println(mitchell);
//        System.out.println(mitchell.getGradeAverage());

//        HashMap<String, Student > students = new HashMap<>();
//        students.put("MitchellHogue0", mitchell);
    }
}
