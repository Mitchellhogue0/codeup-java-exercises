package warmups;

import java.util.Random;

public class RandomTryCatch {

    //WARM UP
// TODO Given this string: `String str = "Oberon is the
//  best cohort ever!"`, print out the character from that
//  string using a random number generator, that generates
//  a number between 0 and 50. Using a try/catch block, handle
//  any errors (Exceptions) that may occur by printing out the
//  message.


    public static void main(String[] args) {
        try {
                String str = "Oberon is the best cohort ever!";
                char c = str.charAt(randomGen());
                System.out.println("Your random Char is: " + c);
        } catch(StringIndexOutOfBoundsException e){
            System.out.println("RandomNumber out of range");
        }

    }

    public static int randomGen() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(50);
        return randomInt;
    }
}
