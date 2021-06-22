import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f\n", pi);
        System.out.println("--------");

        Scanner sc = new Scanner(System.in);

//        System.out.println("please enter a number");
//        int userInput = sc.nextInt();
//        System.out.println(userInput);
//        System.out.println("------");

//        System.out.println("Please enter three words");
//        String firstWord = sc.next();
//        String secondWord = sc.next();
//        String thirdWord = sc.next();
//        System.out.printf("First word: %s\n Second word: %s \n Third word: %s \n", firstWord,secondWord,thirdWord);

//        System.out.println("please enter a sentence");
//        String userSentence = sc.nextLine();
//        System.out.printf("Your sentence: %s", userSentence);



        System.out.println("please enter length and Width");
        int length = sc.nextInt();
        int width = sc.nextInt();

        int perimeter = length + width + length + width;
        int area = length * width;
        System.out.printf("The perimeter is: %d\n", perimeter);
        System.out.printf("The area is: %d", area);

    }
}
