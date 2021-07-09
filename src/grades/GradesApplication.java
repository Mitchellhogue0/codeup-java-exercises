package grades;

import java.util.ArrayList;

public class GradesApplication{


    public static void main(String[] args) {
        Student mitchell = new Student();
        mitchell.addGrade(95);
        mitchell.addGrade(100);
        mitchell.addGrade(90);
//        System.out.println(mitchell);
        System.out.println(mitchell.getGradeAverage());
    }
}
