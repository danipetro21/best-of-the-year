package org.lessons.bestoftheyear.model;

public class Song {

    private int id;
    private String titolo;
    private String artista;

    public Song(int id, String titolo, String artista) {
        this.id = id;
        this.titolo = titolo;
        this.artista = artista;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Titolo: " + getTitolo();
    }
}
