package com.alura.desafioaudio.Estructura;

public class Podcast extends Audio{

    private String tematica;
    private int temporada;
    private int capitulo;

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(int capitulo) {
        this.capitulo = capitulo;
    }

    @Override
    public String toString() {
        return ( super.toString()) +
                "\ntematica= " + tematica +
                "\ntemporada= " + temporada +
                "\ncapitulo= " + capitulo ;
    }
}
