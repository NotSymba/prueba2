
/*
 * Representa una carta, formada por un número y la cantidad de bueyes correspondiente
 */
package gal.uvigo.esei.aed1.Toma6.core;

public class Carta {
    private int NumCartas;
    private int buyes;
    
    public Carta( int NumCartas, int buyes){
        this.NumCartas=NumCartas;
        this.buyes= buyes;
    }
    
    public int getNumCartas(){
        return NumCartas;
    }
    public int getBuyes(){
        return buyes;
    }
    public void setNumCartas(int NumCartas){
        this.NumCartas=NumCartas;
    }
    public void setBuyes(int Buyes){
        this.buyes=buyes;
    }
    
    public String toString(){
        StringBuilder toret= new StringBuilder();
        
        toret.append("Numero de Cartas:").append(getNumCartas());
        toret.append("\tBuyes:").append(getBuyes());
        
        return toret.toString();  
    }

}
