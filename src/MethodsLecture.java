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

    public static void main(String[] args) {
        System.out.println(info("Mitchell", "Hogue", 21, "Do or do not..."));

    }

    //Method overloading

    public static void greeting(){
        System.out.println("Hello world");
    }

    public static void greeting(int randomNumber){
        System.out.println(randomNumber);
    }

    public static void greeting(char randomChar){
        System.out.println(randomChar);
    }

    public static void greeting(int randomNum, int anotherNum){
        System.out.println(randomNum + anotherNum);
    }


    //    TODO: invoke a method that accepts (and returns) the following:
//        - accepts: your first name and your last name. returns: A
//        string that reads: "Hello Laura Ruiz-Roehrs (replace with your
//        first and last)";
//.       - accepts: your age. returns: "that's crazy! you don't look
//        100 years old!"
//.      -accepts: your favorite quote. returns: "your fave quote"

public static String info(String first, String last, int age, String quote){
         return "Hello " + first + " " + last + "\n" + "age: " + age + "\n" + quote;
}




}







