import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }
//        int i = 100;
//        do {
//            i -= 5;
//        } while (i > 0);
//        System.out.println(i);
//        float i = 2;
//        do {
//            i = i * i;
//        System.out.println(i);
//        } while (i < 1000000);

//        for (int i =100; i > 0; i-= 5) {
//            System.out.println(i);
//        }

//        for (double i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }

//        for (int i = 0; i < 100; i++) {
//            if (i % 15 == 0){
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            }else if (i % 3 == 0){
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        table();
        letterGrade();



    }

    public static void letterGrade(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your numeric grade: ");
        int input = sc.nextInt();
        if (88 <= input && input <= 100){
            System.out.println("That's an A! Nice!");
        } else if (80 <= input && input <= 87){
            System.out.println("That's a B! Good stuff!");
        } else if (67 <= input && input <= 79){
            System.out.println("That's a C! Still passing!");
        } else if (60 <= input && input <= 66){
            System.out.println("That's a D, we can bring that up!");
        } else {
            System.out.println("Oh man that's failing... Let's bring that up, yeah?");
        }
        System.out.println("Would you like to input another grade? y/n");
        String input2 = sc.next();
        if (input2.equals("y")){
            letterGrade();
        }  else {
            System.out.println("Deuces!");
        }
    }

    public static void table(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What number would you like to go up to?");
        int input = sc.nextInt();
        System.out.println("Here is your table!");
        for (int i = 1; i <= input; i++) {
            int num = i;
            int mult = i * i;
            int cube = i * i * i;
            System.out.format("%-15s%-15s%-15s%n", num, mult, cube);
        }
        System.out.println("Would you like to continue?");
        String input2 = sc.next();
        if (input2.equalsIgnoreCase("yes")){
            table();
        } else {
            System.out.println("Goodbye!");
        }
    }
}
