package movies;

import java.util.Scanner;

public class MoviesApplication extends Movie{

    public MoviesApplication(String name, String movie) {
        super(name, movie);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie movie = new Movie();
        System.out.println("Would you like to see all movies? yes or no: ");
        String input = sc.nextLine();
        if (input.equals("yes")){
            movie.getMovie();
        }

    }
}
