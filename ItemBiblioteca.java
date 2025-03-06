package biblioteca;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public interface ItemBiblioteca{
    //implicitamente static e final
    int diasEmprestimo = 10;
    //todos os metodos em uma interface sao publcos e abstratos
    boolean estaEmprestado ();
    void emprestar ();
    void devolver ();
    String localizacao ();
}

/**
 *
 * 
