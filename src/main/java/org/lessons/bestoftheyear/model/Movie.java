package org.lessons.bestoftheyear.model;

public class Movie {

    private int id;
    private String titolo;
    private String descrizione;


    public Movie(int id, String titolo, String descrizione) {
        this.id = id;
        this.titolo = titolo;
        this.descrizione = descrizione;
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


    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "Titolo: " + getTitolo();
    }

}
