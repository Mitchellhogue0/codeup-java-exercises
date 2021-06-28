public class MethodsLecture {
    public static void main(String[] args) {

        Teams("The Spurs");


    }

    public static String Teams(String team){
        System.out.printf("%s is the best basketball team", team);
        return team;
    }
}


//    TODO: create a new method that accepts the name of a basketball
//     team (ex: the spurs) and returns a String that says
//     "[basketballTeam] is the best team.". Invoke that method within
//     your main method (remember to pass in the name of the basketball
//     team). print out the result of the new method.