package juego;
import java.util.Random;
import java.util.Scanner;
public class Reto5 implements Juego {
    Scanner leer=new Scanner(System.in);
    String jugador;
    int eleccion, jugador2;
    @Override
    public void iniciar() {
        System.out.println("ingrese el nombre del jugador:");
         jugador= leer.nextLine();
    }

    @Override
    public void jugar() {
        System.out.println("escoje una opcion 1.piedra, 2.papel, 3.tijera");
        eleccion= leer.nextInt();
        System.out.println("......");
        Random aleatorio=new Random();
        jugador2=aleatorio.nextInt(3);
    }
    

    @Override
    public void finalizar() {
        if (eleccion==1 && jugador2 == 2){
                System.out.println("piedra le gana a papel, ganaste!!");
            }
            else if(eleccion == 1 && jugador2==3){
                System.out.println("piedra le gana a tijera, ganaste!!");
            }
            else if(eleccion==2 && jugador2==1){
                System.out.println("papel pierde contra piedra, perdiste!!");
            }
            else if(eleccion==2 && jugador2==3){
                System.out.println("papel pierde contra tijera, perdiste!!");
            }
            else if(eleccion==3 && jugador2==1){
                System.out.println("piedra pierde contra tijera, perdiste!!");
            }
            else if(eleccion==3 && jugador2==2){
                System.out.println("tijera le gana a papel, ganaste!!");

            }
            else if (eleccion == jugador2){
                System.out.println("sacaron lo mismo, ninguno pierde ni gana");
            }
        
        
    }

}