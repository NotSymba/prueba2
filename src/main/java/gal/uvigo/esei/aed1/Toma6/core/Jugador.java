/*
 * Representa a un jugador, identificado por el nombre y sus cartas de la mano
 * Estructura mano: se utilizará un TAD adecuado
 * Funcionalidad: Añadir carta a la mano (añadir la carta de foma que queden 
 * ordenadas de menor a mayor por su número), convertir a String el objeto Jugador (toString)
 */
package gal.uvigo.esei.aed1.Toma6.core;
import pila.*;

public class Jugador {

    private String Nombre;
    private Jugador siguiente;
    private Pila<Carta> barajaJ= new EnlazadaPila<>();

    public Jugador(String Nombre, Jugador siguiente, Baraja laBaraja) {
        this.Nombre = Nombre;
        this.siguiente = siguiente;
        barajaJ=crearBaraja(laBaraja);
        
    }
    public Pila<Carta> crearBaraja(Baraja laBaraja){
        Pila<Carta> toret= dividir(laBaraja);
        Pila<Carta> aux= new EnlazadaPila();
        Pila<Carta> aux2= new EnlazadaPila();
        int i=0;
        boolean f = false;
        while (i<10 && !f){
            if (i==0) {
                aux.push(toret.pop());
            }else if( toret.top().getNumCartas() < aux.top().getNumCartas()){
                aux.push(toret.pop());
            }else{
                aux2.push(toret.pop());
            }
            if(i==9 && aux2.esVacio()){
                f = true;
            }else{
                while (!aux2.esVacio()) {
                    while (!aux.esVacio()) {
                        toret.push(aux.pop());
                    }
                    toret.push(aux2.pop());
                }
                i=0;
            }
        }
        return aux;
    }
    public Pila<Carta> dividir(Baraja laBaraja){
        Pila<Carta> toret= new EnlazadaPila<>();
        for(int i=0; i<10;i++){
            toret.push(laBaraja.returnCarta());
        }
        return toret;
    }
   
    
    public String toString(){
        StringBuilder toret= new StringBuilder();
        Pila<Carta> aux= new EnlazadaPila();
        toret.append("Nombre:").append(Nombre);
        toret.append("Baraja:");
        while(!barajaJ.esVacio()){
            aux.push(barajaJ.pop());
            toret.append("Numero:").append(aux.top().getNumCartas());
            toret.append("Bueyes:").append(aux.top().getBuyes());
        }
        barajaJ=aux;
        return toret.toString();
    }
    
   
}
