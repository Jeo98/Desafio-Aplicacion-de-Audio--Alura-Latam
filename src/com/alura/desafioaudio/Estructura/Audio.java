package com.alura.desafioaudio.Estructura;

public class Audio {

    private String titulo;
    private int duracionEnMinutos=0;
    private int totalDeReproducciones=0;
    private int meGusta=0;
    private double calificacion=0;
    private String tipoDeAudio;



    public void reproducir(){
        System.out.println(this.tipoDeAudio +"\n Reproduciendo: " +  this.titulo + "🎶🎶");
    }


    @Override
    public String toString() {
        return "Audio{" +
                "nombreArtista='" + titulo + '\'' +
                ", duracionEnMinutos=" + duracionEnMinutos +
                ", totalDeReproducciones=" + totalDeReproducciones +
                ", meGusta=" + meGusta +
                ", calificacion=" + calificacion +
                ", tipoDeAudio='" + tipoDeAudio + '\'' +
                '}';
    }

    public void setTitulo(String nombre) {
        this.titulo = nombre;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }



    public void setMeGusta() {
        this.meGusta ++ ; //incremento en 1 por cada megusta
    }


    public void setTipoDeAudio(String tipoDeAudio) {
        this.tipoDeAudio = tipoDeAudio;
    }
    public String getTitulo() {
        return titulo;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public int getMeGusta() {
        return meGusta;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public String getTipoDeAudio() {
        return tipoDeAudio;
    }



}
