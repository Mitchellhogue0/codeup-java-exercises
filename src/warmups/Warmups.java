package warmups;

import java.util.Arrays;
import java.util.Scanner;

public class Warmups {

    public static void main(String[] args) {
//
//        System.out.println("The amount of capital letters in the given string is: ");
//        System.out.println(isCapital("The Very BiG Sentence"));
//    }
//
//    public static int isCapital(String string) {
//        int count = 0;
//        for (int i = 0; i < string.length(); i++){
//            if (Character.isUpperCase(string.charAt(i))) {
//                count++;
//            }
//        }
//        return count;

        // TODO: Create a method which will return a String[] containing the user's favorite vacation spots
//  -> Each time the user inputs a new vacation spot, reset the array to be one element longer in length
//  -> Then, add the old elements
//  -> Finally, add the new element
//  -> When the user decides to finish inputting spots, return the String[].
//  -> sout out the returned value!

input();

    }

    public static void  input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Your favorite vacation spots are: ");
        String[] vacations = {"Colorado", "New York", "California"};
        System.out.println(Arrays.toString(vacations));

        System.out.println("Please enter a new location: ");
        String vacation = sc.nextLine();
        System.out.println(Arrays.toString(addVacation(vacation,vacations)));
        System.out.println("Would you like to input another? ");
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("yes")){
            input();
        } else {
            return;
        }
    }

    public static String[] addVacation(String vacation, String[] vacations){
        vacations = Arrays.copyOf(vacations, vacations.length + 1);
        vacations[vacations.length -1] = vacation;
        return vacations;
    }
}
