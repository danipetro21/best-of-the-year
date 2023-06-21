package org.lessons.bestoftheyear.controller;

import org.lessons.bestoftheyear.model.Movie;
import org.lessons.bestoftheyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller //dice a spring che è un controller
@RequestMapping("/") // a quale rotta rispondono i metodi di questo controller
public class IndexController {


    @GetMapping()
    public String template(Model model) {
        model.addAttribute("title", "Daniele Petrollo");
        return "index"; //ritorno del template
    }


    public ArrayList<Movie> getBestMovies() {
        ArrayList<Movie> bestMovies = new ArrayList<>();

        bestMovies.add(new Movie(1, "Il Gladiatore", "Un generale romano diventa schiavo e poi gladiatore, cercando vendetta contro l'imperatore che ha ucciso la sua famiglia."));
        bestMovies.add(new Movie(2, "Inception", "Un ladro esperto entra nei sogni delle persone per rubare informazioni preziose."));
        bestMovies.add(new Movie(3, "Interstellar", "Un gruppo di astronauti viaggia attraverso i buchi neri per cercare una nuova casa per l'umanità."));
        bestMovies.add(new Movie(4, "The Dark Knight", "Il supereroe Batman affronta il suo più grande nemico, il Joker, in una lotta per la salvezza di Gotham City."));
        bestMovies.add(new Movie(5, "Fight Club", "Un uomo insoddisfatto crea un club segreto di lotta underground come forma di ribellione contro la società."));
        bestMovies.add(new Movie(6, "Pulp Fiction", "Un intreccio di storie violente e bizzarre coinvolge personaggi criminali e disperati."));
        bestMovies.add(new Movie(7, "The Shawshank Redemption", "La storia di un banchiere condannato ingiustamente che trova speranza e redenzione in prigione."));
        bestMovies.add(new Movie(8, "The Godfather", "La saga di una famiglia mafiosa che cerca di mantenere il controllo sulle attività criminali."));
        bestMovies.add(new Movie(9, "The Matrix", "Un uomo scopre che il mondo in cui vive è una simulazione controllata da macchine intelligenti."));
        bestMovies.add(new Movie(10, "Star Wars", "Una epica battaglia tra il bene e il male nello spazio, con cavalieri Jedi, Sith e combattimenti intergalattici."));


        return bestMovies;

    }

    public ArrayList<Song> getBestSongs() {
        ArrayList<Song> bestSongs = new ArrayList<>();

        bestSongs.add(new Song(1, "Bohemian Rhapsody", "Queen"));
        bestSongs.add(new Song(2, "Hotel California", "Eagles"));
        bestSongs.add(new Song(3, "Stairway to Heaven", "Led Zeppelin"));
        bestSongs.add(new Song(4, "Imagine", "John Lennon"));
        bestSongs.add(new Song(5, "Hey Jude", "The Beatles"));
        bestSongs.add(new Song(6, "Smells Like Teen Spirit", "Nirvana"));
        bestSongs.add(new Song(7, "Thriller", "Michael Jackson"));
        bestSongs.add(new Song(8, "Like a Rolling Stone", "Bob Dylan"));
        bestSongs.add(new Song(9, "Wonderwall", "Oasis"));
        bestSongs.add(new Song(10, "Sweet Child O' Mine", "Guns N' Roses"));


        return bestSongs;

    }


    @GetMapping("/movies")
    public String templateMovie(Model model) {
        model.addAttribute("bestMovie", getBestMovies());
        return "movie"; //ritorno del template
    }
    @GetMapping("/songs")
    public String templateSong(Model model) {
        model.addAttribute("bestSong", getBestSongs());
        return "song"; //ritorno del template
    }

    @GetMapping("movie/{id}")
    public String detailMovie(@PathVariable Integer id, Model model){
        Movie currentMovies = null;
        for(Movie movies: getBestMovies()){
            if(movies.getId() == id){
                currentMovies = movies;
            }
        }
        model.addAttribute("movie", currentMovies);
        return "detailMovie";
    }

    @GetMapping("song/{id}")
    public String detailSong(@PathVariable Integer id, Model model){
        Song currentSong = null;
        for(Song songs: getBestSongs()){
            if(songs.getId() == id){
                currentSong = songs;
            }
        }
        model.addAttribute("song", currentSong);
        return "detailSong";
    }


}
