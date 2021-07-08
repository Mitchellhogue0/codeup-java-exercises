package movies;

import java.util.Scanner;

public class MoviesApplication extends Movie{

    public MoviesApplication(String name, String movie) {
        super(name, movie);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie movie = new Movie();
        System.out.println("What would you like to do? ");
        System.out.println("0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n");
        System.out.println("enter your choice: ");
        String input = sc.nextLine();
        if (input.equals("1")){
//            movie
        }

    }
}
