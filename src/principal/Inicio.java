package principal;

import Salud.Empleado;
import Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        Persona Datos=new Persona ();
        Empleado objeto=new Empleado();
        Datos.pedirDatos();
        Datos.mostrarPersona();
        
        
    //reto2
        String resultado = Datos.calcularImc();
        if(resultado.equalsIgnoreCase("Peso bajo")){
            System.out.println("estas bajo de peso");
        }
        else if( resultado.equalsIgnoreCase("Peso ideal")){
            System.out.println("estas en el peso ideal");
        }
        else{
            System.out.println("estas en sobrepeso");
        }
        Datos.mayorEdad();
    //reto3
    System.out.println();
    Persona datos=new Persona("Salome", "cedula", 18);

    

    datos.mostrarDatos();

    Persona datos2=new Persona(55);
    datos.mostrarDatos();

  
    
 }
}
