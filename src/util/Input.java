package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;
    private int number;
    private double doubleNum;


    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Please enter a string: ");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Yes or no?");
        String answer = scanner.next().toLowerCase();
        if (answer.equals("y") || answer.equals("yes")){
            return true;
        }
        return false;
    }

    public int getInt(int min, int max){
        try {
            System.out.printf("Please pick a number between %s and %s\n", min, max);
            int number = Integer.parseInt(getString());
            if (number < min) {
                getInt(min, max);
            } else if (number > max) {
                getInt(min, max);
            }
        } catch (Exception e){
            System.out.println("Not a valid number");
        }

        return this.number;
    }

    public double getDouble(double min, double max){
        try {
            System.out.printf("Please pick a number between %s and %s\n", min, max);
            int number = Integer.parseInt(getString());
            if (number < min) {
                getDouble(min, max);
            } else if (number > max) {
                getDouble(min, max);
            }
        } catch (Exception e){
            System.out.println("Not a valid number");
        }
        return this.number;
    }











}
