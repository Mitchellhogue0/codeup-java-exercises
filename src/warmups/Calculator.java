package warmups;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
      input();
    }


    public static void input(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int input = sc.nextInt();
        System.out.println("which Operator would you like to use? (* , / , + , - , % )");
        String operator = sc.next();
        System.out.println("PLease enter another number: ");
        int input2 = sc.nextInt();
        theOperators(operator, input, input2);
        System.out.println("Would you like to calculate more?");
        String yesNo = sc.nextLine();
    }



    public static void theOperators(String operator, int input, int input2) {
        switch (operator) {
            case "*":
                System.out.printf("%s %s %s = ", input, operator, input2);
                System.out.println(input * input2);
                input();
                break;
            case "/":
                System.out.printf("%s %s %s = ", input, operator, input2);
                System.out.println(input / input2);
                input();
                break;
            case "+":
                System.out.printf("%s %s %s = ", input, operator, input2);
                System.out.println(input + input2);
                input();
                break;
            case "-":
                System.out.printf("%s %s %s = ", input, operator, input2);
                System.out.println(input - input2);
                input();
                break;
            case "%":
                System.out.printf("%s %s %s = ", input, operator, input2);
                System.out.println(input % input2);
                input();
                break;
            default:
                System.out.println("That is not an operator, try again: ");
                input();
                break;
        }
    }
}
