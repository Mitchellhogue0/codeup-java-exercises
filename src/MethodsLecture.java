import java.util.Scanner;

public class MethodsLecture {
//    public static void main(String[] args) {
//
////        TeamLength(Teams("The Spurs"));
//
//
//    }

    //    TODO: create a new method that accepts the name of a basketball
//     team (ex: the spurs) and returns a String that says
//     "[basketballTeam] is the best team.". Invoke that method within
//     your main method (remember to pass in the name of the basketball
//     team). print out the result of the new method.

//    public static String Teams(String team){
//        System.out.printf("%s is the best basketball team \n", team);
//        return team;
//    }
////    TODO: create a new method that accepts the string created from the
////     first method and returns the number of characters in that string.


//    public static String TeamLength(String team){
//        int length = team.length();
//        System.out.printf("Amount of letters in team name: %s \n", length);
//        return team;
//    }


//    public static void main(String[] args) {
////        System.out.println(info("Mitchell", "Hogue", 21, "Do or do not..."));
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Tell us your name?");
//        String userName = sc.next();
//        System.out.println("How old are you?");
//        int userAge = sc.nextInt();
//        System.out.println("True/false, do you have any pets?");
//        boolean userPets = sc.nextBoolean();
//
//        System.out.printf("Your name is: %s", info(userName));
//        info(userAge);
//        info(userPets);
//    }

    //Method overloading

//    public static void greeting(){
//        System.out.println("Hello world");
//    }
//
//    public static void greeting(int randomNumber){
//        System.out.println(randomNumber);
//    }
//
//    public static void greeting(char randomChar){
//        System.out.println(randomChar);
//    }
//
//    public static void greeting(int randomNum, int anotherNum){
//        System.out.println(randomNum + anotherNum);
//    }


    //    TODO: invoke a method that accepts (and returns) the following:
//        - accepts: your first name and your last name. returns: A
//        string that reads: "Hello Laura Ruiz-Roehrs (replace with your
//        first and last)";
//.       - accepts: your age. returns: "that's crazy! you don't look
//        100 years old!"
//.      -accepts: your favorite quote. returns: "your fave quote"

//public static String info(String first, String last, int age, String quote){
//         return "Hello " + first + " " + last + "\n" + "age: " + age + "\n" + quote;
//}

//    WARMUP
//    TODO: prompt a user to tell us about themselves (age, name, if
//     they have any pets (true/false). Using method overloading, create
//     methods that will return the first fact they told us about
//     themselves. ex: I can input: 18 -- Laura -- false in which case I
//     expect you to return: 18. but if I tell you my name first: Laura --
//     false -- 18. I expect you to return "Laura" ... etc.


//    public static String info(String name){
//        return name;
//    }
//
//    public static int info(int age){
//        return age;
//    }
//
//    public static boolean info(boolean pets){
//        return pets;
//    }
//
//
//    public static void main(String[] args) {
//        String tryChangingMe = "Hello, random :)"; //ORIGINAL REFERENCE
//        changeString(tryChangingMe);
////        System.out.println(tryChangingMe);
//    }
//
//    public static void changeString(String randomString) {
//        System.out.println(randomString); // hello, random
//        randomString = "this is random"; // hello random --> this is random
//        System.out.println(randomString); // referencing the value that was passed in (copy) which we changed
//    }


//    public static void main(String[] args) {
//        // int is a primitive data type
//        // Integer is an object with assignments and other things . .
//        Integer numero = 10;
//        System.out.println(numero.hashCode());
//        System.out.println(returnNum(numero).hashCode());
//    }
//
//    public static Integer returnNum(Integer randomNum){
//        System.out.println(randomNum.hashCode());
//        randomNum++;
//        System.out.println(randomNum.hashCode());
//        return randomNum; //shallow copy
//    }

    // RECURSION

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("How many seats are in the movie theatre?");
//        int seatsLeft = sc.nextInt();
//        movieTheatre(seatsLeft);
//
//    }
//
//    public static void movieTheatre(int seats){
//        if(seats > 0){
//            System.out.printf("There are %s seats available\n", seats);
//            seats--;
//            System.out.printf("seats: %s\n", seats);
//            movieTheatre(seats);
//        }
//    }

    //    TODO: you are a sports manager. Prompt your client who is training
//     for a marathon how many miles they have to run today. You're the
//     coach, so you decide how many miles they ran that day. print out
//     how many miles they have left in training until they have 0 miles
//     left.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Trainer: How many miles did you run today?");
        int miles = sc.nextInt();
        trainer(miles);
        System.out.println("Nice! you're good for the day");
    }

    public static void trainer(int miles){
        if (miles > 0){
            System.out.printf("Trainer: You still have %s miles left! Keep going!\n", miles);
            miles--;
            System.out.printf("Miles: %s\n", miles);
            trainer(miles);
        }
    }

}







