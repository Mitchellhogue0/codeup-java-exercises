import java.util.ArrayList;
import java.util.Scanner;

public class ExeceptionAndErrorHandling {

    public static void main(String[] args) {
//        int myNum = Integer.parseInt("eighteen");


//        ArrayList<Integer> myArrList = new ArrayList<Integer>();
//        myArrList.get(2);

//        impossible(8,0);

        //* MINI EXERCISE*//
//        Let’s say that you’re writing a program that checks whether or not a user is eligible to open up a new bank
//        account. They requirements are that they have to be older than 16 years old and have at least $200 to start
//        their bank account. Write a method that will return a string that states whether they’re eligible to bank at
//        Banco di Laura or whether they are not eligible, make sure to  throw an `NumberFormatException` if the user
//        inputs anything that’s not a number (none, zero, zilch, nada, etc).
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        System.out.println("Please enter your current balance: ");
        int money = sc.nextInt();

        banco(age, money);

    }

    public static void banco (int age, int money ){
        if (age < 16){
            throw new NumberFormatException();
        } else if (money < 200){
            throw new NumberFormatException();
        } else {
            System.out.println("Welcome to Banco Di Laura!");
        }
    }

    public static void impossible (int num1, int num2){
        if (num1 == 0){
            throw new ArithmeticException();
        } else {
            System.out.println(num1 / num2);
        }
    }
}
