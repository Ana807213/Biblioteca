/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author aniii
 */
public class MapaBiblioteca extends Mapa implements ItemBiblioteca {
    private boolean emprestado;
    private String local;
    
MapaBiblioteca (String escala, String local){
    super (escala);
    this.local = local;
    this.emprestado = false; // acabou de ser criado, nao deve ser emprestado ainda
}
public boolean isEmprestado (){
    return emprestado;
}
public void setEmprestado (boolean emprestado){
    this.emprestado = emprestado;
}
public String getLocal (){
    return local;
}
@Override 
public boolean estaEmprestado (){
    return emprestado;
}
@Override 
public void emprestar (){
    emprestado = true;
    System.out.println (" escala mapa " + getEscala ()+ " foi retirado e deve ser devolvido em " +  diasEmprestimo + " dias " );
}
@Override 
public void devolver (){
    emprestado = false;
}
@Override 
public String localizacao (){
    return local;
}
@Override
public String toString (){
    return super.toString();
}
}
