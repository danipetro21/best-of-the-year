package org.lessons.bestoftheyear.controller;

import org.lessons.bestoftheyear.Movie;
import org.lessons.bestoftheyear.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

        Movie gladiatore = new Movie(1, "Il Gladiatore");
        bestMovies.add(gladiatore);
        Movie inception = new Movie(2, "Inception");
        bestMovies.add(inception);
        Movie interstellar = new Movie(3, "Interstellar");
        bestMovies.add(interstellar);
        Movie theDarkKnight = new Movie(4, "The Dark Knight");
        bestMovies.add(theDarkKnight);
        Movie fightClub = new Movie(5, "Fight Club");
        bestMovies.add(fightClub);
        Movie pulpFiction = new Movie(6, "Pulp Fiction");
        bestMovies.add(pulpFiction);
        Movie theShawshankRedemption = new Movie(7, "The Shawshank Redemption");
        bestMovies.add(theShawshankRedemption);
        Movie theGodfather = new Movie(8, "The Godfather");
        bestMovies.add(theGodfather);
        Movie theMatrix = new Movie(9, "The Matrix");
        bestMovies.add(theMatrix);
        Movie starWars = new Movie(10, "Star Wars");
        bestMovies.add(starWars);

        return bestMovies;

    }

    public ArrayList<Song> getBestSongs() {
        ArrayList<Song> bestSongs = new ArrayList<>();

        Song song1 = new Song(1, "Bohemian Rhapsody");
        bestSongs.add(song1);
        Song song2 = new Song(2, "Hotel California");
        bestSongs.add(song2);
        Song song3 = new Song(3, "Stairway to Heaven");
        bestSongs.add(song3);
        Song song4 = new Song(4, "Imagine");
        bestSongs.add(song4);
        Song song5 = new Song(5, "Hey Jude");
        bestSongs.add(song5);
        Song song6 = new Song(6, "Smells Like Teen Spirit");
        bestSongs.add(song6);
        Song song7 = new Song(7, "Thriller");
        bestSongs.add(song7);
        Song song8 = new Song(8, "Like a Rolling Stone");
        bestSongs.add(song8);
        Song song9 = new Song(9, "Wonderwall");
        bestSongs.add(song9);
        Song song10 = new Song(10, "Sweet Child O' Mine");
        bestSongs.add(song10);

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
}
