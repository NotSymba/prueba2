/**
 * Representa el juego Toma 6, con sus reglas (definidas en el documento Primera entrega). 
 * Se recomienda una implementación modular.
 */

package gal.uvigo.esei.aed1.Toma6.core;


import gal.uvigo.esei.aed1.Toma6.iu.IU;
import java.util.Scanner;


public class Juego {
    
    private final IU iu;
    private int numJugadores;
    private Jugador ultimo;
    
    public Juego(IU iu){
        this.iu = iu;
        ultimo=null;
        numJugadores=0;
    }
        
    public void jugar(){
        

    }
    public void jugadores(String Nombre) {
        Scanner entrada = new Scanner(System.in);
        int numJugadores;
        do {
            System.out.println("Cuantos jugadores van a jugar?");
            numJugadores = entrada.nextInt();
        }while(numJugadores<2 && numJugadores>10);
        
        for(int i=0; i<numJugadores;i++){
            System.out.println("Ingresa el nombre del jugador: "+(i+1));
            Nombre= entrada.nextLine();
        }
    }
    public void setNumJugadores(int numJugadores){
        this.numJugadores=numJugadores;
    }
    
    
    
}
