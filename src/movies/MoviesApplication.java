package movies;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +

                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n");

        System.out.println("Enter a number: ");
        int number = input.getInt();
        if(number == 0){
            System.out.println("Good bye!");
        } else if (number == 1) {
            Movie[] allMovies = MoviesArray.findAll();
            for(Movie movie : allMovies){
                System.out.println(movie.getName());
            }
        }else if(number == 2){
            Movie[] allMovies = MoviesArray.findAll();

            for(Movie movie : allMovies){
                if(movie.getCategory().equals("animated")){
                    System.out.println(movie.getName());
                }
            }
        }else if (number == 3){
            Movie[] allMovies = MoviesArray.findAll();

            for(Movie movie : allMovies){
                if(movie.getCategory().equals("drama")){
                    System.out.println(movie.getName());
                }
            }
        }else if (number == 4){
            Movie[] allMovies = MoviesArray.findAll();

            for(Movie movie : allMovies){
                if(movie.getCategory().equals("horror")){
                    System.out.println(movie.getName());
                }
            }
        }else if (number == 5){
            Movie[] allMovies = MoviesArray.findAll();

            for(Movie movie : allMovies){
                if(movie.getCategory().equals("scifi")){
                    System.out.println(movie.getName());
                }
            }

        }

    }
}
