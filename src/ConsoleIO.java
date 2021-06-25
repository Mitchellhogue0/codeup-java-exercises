import java.util.Scanner;

public class ConsoleIO {

    public static void main(String[] args) {
//       "sout" = System.out.println();
        String name = "Mitchell";
        String role = "student";
        String hobby = "play Video Games";
        int age = 21;
        System.out.printf("Hello, My name is %s. I am a %s and I love to %S! I am %d years old\n", name, role, hobby, age);

        float currencyInPennies = 1000.0000f;

       String mySentence = String.format("I will sell this swamp for $%.2f per acre", currencyInPennies);

        System.out.println(mySentence);
        System.out.println("-----------");


        Scanner sc = new Scanner(System.in);
//        System.out.println("what is your whole name?");
//        String FirstName = sc.next();
//        String LastName = sc.next();
//        System.out.printf("You entered: %s %s\n", FirstName, LastName);

        /* TODO: use the scanner to take in the name of the month you were born and print it back out
    - remember to first prompt the user for the input
 */
//        System.out.println("What is the day, month, and year?");
//        String day = sc.next();
//        String month = sc.next();
//        String year = sc.next();
//        System.out.printf("You entered %s %s %s", day,month,year);

//        System.out.println("Enter a numb3r: ");
//        int myNum = sc.nextInt();
//        System.out.println(myNum);

//        System.out.println("Stack your sentence! Type a sentence: ");
//        while (sc.hasNext()){
//            String word = sc.next();
//            if (word.equals("break")){
//                break;
//            }
//
//            System.out.println(word);
//        }

        System.out.println("Please enter your favorite quote: ");

        String FavoriteQuote = sc.nextLine();
        System.out.println(FavoriteQuote);
        System.out.println("How many words are in your favorite quote");
        int QuoteWords = sc.nextInt();
        System.out.println(QuoteWords);

    }
}
