package movies;

import java.util.Scanner;


public class MoviesApplication extends Movie{

    public MoviesApplication(String name, String movie) {
        super(name, movie);
    }

    public static void main(String[] args) {
        input();
    }

    public static void input (){
        Scanner sc = new Scanner(System.in);
        Movie[] allMovies = MoviesArray.findAll();
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
            System.out.println(returnAll(allMovies));
            input();
        } else if (input.equals("2")){
            System.out.println(returnByGen(allMovies, "animated"));
            input();
        } else if (input.equals("3")){
            System.out.println(returnByGen(allMovies, "drama"));
            input();
        } else if (input.equals("4")){
            System.out.println(returnByGen(allMovies, "horror"));
            input();
        } else if (input.equals("5")){
            System.out.println(returnByGen(allMovies, "scifi"));
            input();
        } else if (input.equals("0")){
            System.out.println("Goodbye!");
        }

    }

    public static String returnByGen (Movie[] movies, String genre){
        StringBuilder moviesSoFar = new StringBuilder();

        for (Movie movie : movies){
            if (genre.equals("animated")){
                if (movie.getCategory().equals("animated")){
                    moviesSoFar.append("\nName: ").append(movie.getName()).append(" \nGenre: ").append(movie.getCategory()).append("\n----------------");
                }
            }
            if (genre.equals("drama")){
                if (movie.getCategory().equals("drama")){
                    moviesSoFar.append("\nName: ").append(movie.getName()).append(" \nGenre: ").append(movie.getCategory()).append("\n----------------");
                }
            }
            if (genre.equals("horror")){
                if (movie.getCategory().equals("horror")){
                    moviesSoFar.append("\nName: ").append(movie.getName()).append(" \nGenre: ").append(movie.getCategory()).append("\n----------------");
                }
            }
            if (genre.equals("scifi")){
                if (movie.getCategory().equals("scifi")){
                    moviesSoFar.append("\nName: ").append(movie.getName()).append(" \nGenre: ").append(movie.getCategory()).append("\n----------------");
                }
            }
        }
        return moviesSoFar.toString();
    }



    public static String returnAll (Movie[] movies){
        StringBuilder moviesSoFar = new StringBuilder();

        for (Movie movie : movies){
            moviesSoFar.append("\nName: ").append(movie.getName()).append(" \nGenre: ").append(movie.getCategory()).append("\n----------------");
        }
        return moviesSoFar.toString();
    }
}
