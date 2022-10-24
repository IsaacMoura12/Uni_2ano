package Aula12;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.io.FileReader;
import java.io.PrintWriter;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        SortedSet<Movie> movies = newPath("./src/Aula12/movies.txt");


        System.out.println("Movies by alphabetic order");
        for (Movie movie : movies){
            System.out.println(movie.toString());
        }


        System.out.println("Movies ordered by lowest score");
        SortedSet<Movie> movies_dec = new TreeSet<>(Comparator.comparing(Movie::getScore).reversed());
        movies_dec.addAll(movies);
        for(Movie movie : movies_dec){
            System.out.println(movie.toString());
        }



        System.out.println("Movies ordered by highest Duration:");
        SortedSet<Movie> movie_cres = new TreeSet<>(Comparator.comparing(Movie::getDuration));
        movie_cres.addAll(movies);
        for (Movie filme : movie_cres) {
            System.out.println(filme.toString());
        }


    
        

        System.out.println("Movie Genres: ");
        SortedSet<String> genres = new TreeSet<String>();
        for (Movie movie : movies) genres.add(movie.getGenre());
        for (String genre : genres) System.out.println(genre);



        System.out.println("Write in my selection: Comedy Movies");
        String out = "";
        for(Movie movie : movies){
            if(movie.getScore() > 60 && movie.getGenre().equals("comedy")){
                out += movie.toString() + "\n";

            }
        }

        writeFile("./src/Aula12/myselection.txt", out);
        System.out.println(out);

    }

    public static SortedSet<Movie> newPath(String path) throws IOException{
        FileReader file_reader = new FileReader(path);
        Scanner file_scanner = new Scanner(file_reader);
        SortedSet<Movie> conjunto = new TreeSet<>();
        file_scanner.nextLine();

        while (file_scanner.hasNextLine()){
            String line = file_scanner.nextLine();
            String[] fields = line.split("\t");
            conjunto.add(new Movie(fields[0], Float.parseFloat(fields[1]), fields[2], fields[3], Integer.parseInt(fields[4])));
        }
        file_scanner.close();
        file_reader.close();

        return conjunto;
    }

    public static void writeFile(String path, String content) throws IOException{
        PrintWriter out = new PrintWriter(new File(path));
        out.print(content);
        out.close();
    }


    
}
