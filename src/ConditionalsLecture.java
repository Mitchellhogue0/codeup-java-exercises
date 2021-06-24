import java.util.Scanner;

public class ConditionalsLecture {

    public static void main(String[] args) {


        //        MINI EXERCISE
        // TODO: create three unique usernames (user1, user2, user3).
        //  create a fourth user and set it equal to user input. (ask
        //  the user to enter a username). if the username has already
        //  been used by user1, user2, or user3, print "sorry this
        //  username already exists.

        String user1 = "WahtDidney";
        String user2 = "YaasterModa";
        String user3 = "Adriek302";

        System.out.println("Please enter your username: ");
        Scanner sc = new Scanner(System.in);
//        String user4 = sc.next();
//
//
//        if (user4.equalsIgnoreCase(user1)){
//            System.out.println("That username is already taken");
//        }
//
//        if (user4.equalsIgnoreCase(user2)){
//            System.out.println("That username is already taken");
//        }
//
//        if (user4.equalsIgnoreCase(user3)){
//            System.out.println("That username is already taken");
//        }
//        System.out.println("Username Accepted!");

//        switch (user4) {
//            case "WahtDidney":
//                System.out.println("That username is already taken");
//                break;
//            case "YaasterModa":
//                System.out.println("That username is already taken");
//                break;
//            case "Adriek302":
//                System.out.println("That username is already taken");
//                break;
//            default:
//                System.out.println("username accepted!");
//                break;
//        }

        //Caseys alternate trying to use variables in switch
//        switch (true) {
//            case user4.equalsIgnoreCase(user1):
//                System.out.println("That username is already taken");
//                break;
//            case user4.equalsIgnoreCase(user2):
//                System.out.println("That username is already taken");
//                break;
//            case user4.equalsIgnoreCase(user3):
//                System.out.println("That username is already taken");
//                break;
//            default:
//                System.out.println("username accepted!");
//                break;
//        }

        //TODO: using previous mini exercise, allow the user to input a new username several times until a unique username is entered.


//        for(String i = user4; i.equalsIgnoreCase(user1) || i.equalsIgnoreCase(user2) || i.equalsIgnoreCase(user3); i) {
//            System.out.println("That username is already taken");
//        }
//        System.out.println("That user name is accepted!");
        String user4 = sc.next();


        while(user4.equalsIgnoreCase(user1) || user4.equalsIgnoreCase(user2) || user4.equalsIgnoreCase(user3)){
            System.out.println("This username is already taken, try again");
            user4 = sc.next();
        }
        System.out.println("Username accepted!");

    }
}
