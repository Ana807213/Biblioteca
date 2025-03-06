/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

/**
 *
 * @author aniii
 */
public class Biblioteca {

    
    public static void main(String[] args) {
      ItemBiblioteca objetoBiblioteca [] = new ItemBiblioteca [2];
      //preenche o array com objetos
      objetoBiblioteca [0] = new LivroBiblioteca (" Java como programar ", "Deitel", 1200, " Estante A");
      objetoBiblioteca [1] = new MapaBiblioteca ("3x2", "Estante A");
      System.out.println ("\n processamento polimorfico: \n");
      //processa genericamente cada elemento no array
      for (ItemBiblioteca objetoCorrente: objetoBiblioteca){
      objetoCorrente.emprestar();
      System.out.println (" Indicador de emprestimo: " +  objetoCorrente.estaEmprestado());
      System.out.println (objetoCorrente);
      System.out.println (" devolvido ");
      objetoCorrente.devolver();
      System.out.println (" Indicador de emprestimo: " + objetoCorrente.estaEmprestado());
      System.out.println (objetoCorrente.toString ());
      } // for final
    }
    
}
