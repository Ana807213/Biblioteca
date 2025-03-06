/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author aniii
 */
public class Livro {
    private String titulo, autor;
    private int numeroPaginas;
Livro (String titulo, String autor, int numeroPaginas) {
    this.titulo = titulo;
    this.autor = autor;
    this.numeroPaginas = numeroPaginas;
}
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    @Override 
    public String toString (){
        return " titulo " + getTitulo()+ " autor " + getAutor () + " nº " + getNumeroPaginas ();
    }
}
