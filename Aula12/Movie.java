package Aula12;

public class Movie implements Comparable<Movie> {

    private String name, rating , genre;
    private float score;
    private int duration;


    public Movie(String name, Float score, String rating, String genre, int duration){
        this.name = name;
        this.score = score;
        this.duration= duration;
        this.rating = rating;
        this.genre = genre;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public float getScore(){
        return score;
        
    }

    public void setScore(float score){
        this.score = score;
    }

    public String getRating(){
        return rating;
    }

    public void setRating(String rating){
        this.rating = rating;
    }

    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }

    public int getDuration(){
        return duration;
    }


    public void setDuration(int duration){
        this.duration = duration;

    }
    

    @Override
    public String toString() {
        return "Movie{" + "name=" + name + ", score=" + score + ", rating=" + rating + ", genre=" + genre + ", duration=" + duration + '}';
    }

    @Override
    public int compareTo(Movie  o) {
        return this.getName().toLowerCase().compareTo(o.getName().toLowerCase());
    } 
}
