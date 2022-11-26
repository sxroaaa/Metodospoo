package juego;
import java.util.Random;
import java.util.Scanner;
public class Carisellazo implements Juego {
    Scanner leer=new Scanner(System.in);
    private String nombre;
    private int eleccion, moneda;

    @Override
    public void iniciar() {
        System.out.println("ingrese el nombre del jugador");
        nombre=leer.nextLine();
    }

    @Override
    public void jugar() {
        System.out.println("Escoje 1. para cara o 2. para sello");
        eleccion=leer.nextInt();
        System.out.println("... moneda girando.....");
        Random aleatorio=new Random();
        moneda=aleatorio.nextInt(2)+1;
    }

    @Override
    public void finalizar() {
        if (moneda ==1 && eleccion == 1){
            System.out.println("cayo cara, seleccionaste cara, ganaste!! " +nombre);
        }
        else if(moneda == 1 && eleccion==2){
            System.out.println("cayo cara, seleccionaste sello, perdiste:( " +nombre);
        }
        else if(moneda==2 && eleccion==2){
            System.out.println("callo sello, seleccionaste sello, ganaste!! " +nombre);
        }
        else if(moneda==2 && eleccion==1){
            System.out.println("cayo sello, seleccionaste cara, perdiste:( " +nombre);
        }
    }
    
}
