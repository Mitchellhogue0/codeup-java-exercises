import java.util.Scanner;

public class StringsLecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] studentsArr =
                {"Amado", "Christian", "Christopher", "Corey", "Demetrio",
                        "Diamond", "Erik", "Grady", "Jesse", "Joshua",
                        "Juan", "Mitchell", "Moses", "Nathan", "Prachi",
                        "Raul", "Ricardo", "Richard", "Robert", "Sam",
                        "Sean", "Stephen", "Tiffanny", "Wagner", "Laura",
                        "Casey", "Dorian", "Tristan", "Jordy"};
        int randomNum = (int) (Math.random() * 28);
        String randomName = studentsArr[randomNum];
        /* your code goes here */
        System.out.println("Please enter your name: ");
        String userName = sc.next();
        if (userName.equalsIgnoreCase(randomName)){
            System.out.printf("Woah! You guessed: %s, how did you know that %s was my name??", userName,randomName);
        } else {
            System.out.printf("Way off, my friend! My name isn't %s, it's  %s", userName, randomName);
        }

        //        TODO: create a String variable that holds this sentence: "Red
//         Orange Blue Yellow Green Purple". Prompt the user to type in
//         their favorite color, if their fave color is the same as the
//         first word in the String, then print out "my fave color:
//         userColor is the first one". If their fave color is last, then print out "my fave color: userColor is last"
    }
}
