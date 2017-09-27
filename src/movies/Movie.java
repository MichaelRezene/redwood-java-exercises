package movies;

import util.Input;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category){
        this.category = category;
        this.name = name;
    }

    public String getCategory() {

        return category;
    }

    public String getName() {
        return name;
    }
}
