package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication{


    public static void main(String[] args) {
        Student mitchell = new Student("Mitchell");
        mitchell.addGrade(95);
        mitchell.addGrade(100);
        mitchell.addGrade(90);
        Student juan = new Student("Juan");
        juan.addGrade(90);
        juan.addGrade(93);
        juan.addGrade(94);
        Student grady = new Student("Grady");
        grady.addGrade(100);
        grady.addGrade(98);
        grady.addGrade(95);
        Student amado = new Student("Amado");
        amado.addGrade(100);
        amado.addGrade(90);
        amado.addGrade(95);

        HashMap<String, Student > students = new HashMap<>();
        students.put("MitchellHogue0", mitchell);
        students.put("jgonzales0", juan);
        students.put("ggriffin0", grady);
        students.put("aazua0", amado);
//        System.out.println(mitchell.getName());
//        System.out.println(mitchell.getGradeAverage());
        Object key1 = getKeyFromValue(students, mitchell);
        Object key2 = getKeyFromValue(students, juan);
        Object key3 = getKeyFromValue(students, grady);
        Object key4 = getKeyFromValue(students, amado);
        System.out.println("Welcome!");
        commandLine(key1,key2,key3,key4,mitchell,juan,grady,amado);
    }


    public static void commandLine(Object key1, Object key2, Object key3, Object key4, Student mitchell, Student juan, Student grady, Student amado){
        Scanner sc = new Scanner(System.in);
        System.out.println("Here are the Github usernames of our students: ");
        System.out.printf("|%s| |%s| |%s| |%s|\n", key1,key2,key3,key4);
        System.out.println(" Which student would you like more information on?");
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("jgonzales0")){
            System.out.printf("Name: %s - Github username: %s \n Current Grade Average: %s\n", juan.getName(), key2, juan.getGradeAverage());
        } else if (input.equalsIgnoreCase("MitchellHogue0")){
            System.out.printf("Name: %s - Github username: %s \n Current Grade Average: %s\n", mitchell.getName(), key1, mitchell.getGradeAverage());
        } else if (input.equalsIgnoreCase("ggriffin0")){
            System.out.printf("Name: %s - Github username: %s \n Current Grade Average: %s\n", grady.getName(), key3, grady.getGradeAverage());
        } else if (input.equalsIgnoreCase("aazua0")){
            System.out.printf("Name: %s - Github username: %s \n Current Grade Average: %s\n", amado.getName(), key4, amado.getGradeAverage());
        } else {
            System.out.printf("Sorry, no student found with the Github username of \"%s\". \n", input);
        }
        System.out.println("Would you like to see another student? y/n");
        String input2 = sc.nextLine();
        if (input2.equals("y")){
            commandLine(key1,key2,key3,key4,mitchell,juan,grady,amado);
        } else {
            System.out.println("Bye, Have a beautiful tine!");
        }

    }

    public static Object getKeyFromValue(HashMap hm, Object value) {
        for (Object o : hm.keySet()) {
            if (hm.get(o).equals(value)) {
                return o;
            }
        }
        return null;
    }
}
