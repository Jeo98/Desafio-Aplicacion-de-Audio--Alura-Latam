package com.alura.desafioaudio.Estructura;

public class Canciones extends Audio {

    private String generoMusical;
    private String Album;

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String album) {
        Album = album;
    }

    @Override
    public String toString() {
        return  ( super.toString()) + "\n" +
                "Canciones{" +
                "generoMusical='" + generoMusical + '\'' +
                ", Album='" + Album + '\'' +
                '}';
    }
}
