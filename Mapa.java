/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

public class Mapa {
    private String escala;
    public Mapa (String escala){
    this.escala = escala;
    }
public String getEscala () {
    return escala;
}
public void setEscala (String escala){
    this.escala = escala;
}
@Override
public String toString () {
    return " escala mapa " + getEscala ();
}
    
}
