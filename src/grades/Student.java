package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;


    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public Student() {

    }


    public String getName() {
        return name;
    }

    public void addGrade (int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){

        double total = 0;

        for (int grade : this.grades){
            total += grade;
        }
        return total / (grades.size());
    }
}
