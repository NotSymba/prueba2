
/*
* Representa la baraja del juego Toma 6, en total 104 cartas, enumeradas del 1 al 104 con el número de bueyes
* correspondiente en función del valor de la misma (revisar condiciones en el enunciado del juego). 
* Estructura: se utilizará un TAD adecuado
* Funcionalidad: barajar las cartas, devolver la carta situada encima del montón de cartas
 */
package gal.uvigo.esei.aed1.Toma6.core;

import pila.*;
import java.util.Random;
public class Baraja {

    Pila<Carta> baraja = new EnlazadaPila<>();

    public void crearBaraja() {
        int numBueyes = 1;
        for (int i = 1; i < 105; i++) {
            if (i % 5 == 0) {
                numBueyes = 2;
            } else if (i % 10 == 0) {
                numBueyes = 3;
            } else if (i % 11 == 0) {
                numBueyes = 5;
            } else {
                numBueyes = 1;
            }
            if (i == 55) {
                numBueyes = 7;
            }
            Carta c = new Carta(i, numBueyes);
            baraja.push(c);
        }
    }

    public Carta returnCarta() {
        return baraja.pop();
    }
    public void Barajar(){
        Random random= new Random();
        Pila<Carta> aux= new EnlazadaPila<>();
        Pila<Carta> barajada= new EnlazadaPila<>();
        int num=104;
        int ran=0;
        while(num>0){
            ran=random.nextInt(num);
            for(int j=0; j<ran-1; j++){
                aux.push(baraja.pop());
            }
            barajada.push(baraja.pop());
            for(int i=0; i<num-ran;i++){
                baraja.push(aux.pop());
            }
            num--;
        }
        baraja=barajada;
    }

}
