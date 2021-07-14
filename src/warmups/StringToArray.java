package warmups;

import java.util.Arrays;

import java.util.ArrayList;

public class StringToArray {

    public static void main(String[] args) {
        // warmup: write a method that accepts a string and returns a String array that splits at the spaces - you can
        // write this within any main method

//        System.out.println(Arrays.toString(arrayConversion("Let's make sure that that this method works")));

    }

    public static String[] arrayConversion ( String string){
        String[] strArr = string.split(" ");
        return strArr;
    }

}
