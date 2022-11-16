/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author noelia
 */
public class ClaseSerie {
    
    private String titulo;
    private String genero;
    private String sinopsis;
    private String productor;
    private int numeroTemporadas;
    private int numeroLikes;

    public ClaseSerie() {
        
    }
    
    public ClaseSerie(String titulo, String genero, String sinopsis, String productor, int numeroTemporadas, int numeroLikes) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopsis = sinopsis;
        this.productor = productor;
        this.numeroTemporadas = numeroTemporadas;
        this.numeroLikes = numeroLikes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public int getNumeroLikes() {
        return numeroLikes;
    }

    public void setNumeroLikes(int numeroLikes) {
        this.numeroLikes = numeroLikes;
    }

    @Override
    public String toString() {
        return "ClaseSerie{" + "titulo=" + titulo + ", genero=" + genero + ", sinopsis=" + sinopsis + ", productor=" + productor + ", numeroTemporadas=" + numeroTemporadas + ", numeroLikes=" + numeroLikes + '}';
    }
    
    public void darLike(){
        this.numeroLikes++;
    }
    
}
