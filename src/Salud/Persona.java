package Salud;
import java.util.Scanner;
public class Persona{
    public String tipodoc, doc, nombre, apellido, sexo, resultado;
    public int edad;
    public double peso, estatura, imc;
    Scanner leer=new Scanner(System.in);

    /* */ public void pedirDatos(){
        System.out.println("ingrese su nommbre");
        nombre=leer.nextLine();

        System.out.println("ingrese su apellido");
        apellido=leer.nextLine();
        
        System.out.println("ingrese su tipo de documento");
        tipodoc=leer.nextLine();

        System.out.println("ingrese su numero de documento");
        doc=leer.nextLine();
        
        System.out.println("ingrese el sexo con el que se identifica");
        sexo=leer.nextLine();

        System.out.println("ingrese su edad");
        edad=leer.nextInt();

        System.out.println("ingrese su peso");
        peso=leer.nextDouble();

        System.out.println("ingrese su estatura");
        estatura=leer.nextDouble();
    }

     public void mostrarPersona(){
        System.out.println("nombre: " +nombre+ "\n apellido: " +apellido+"\n tipo doc: " +tipodoc+"\n documento:"+doc+
        "\n sexo: " +sexo+"\n edad:"+edad+ "\n peso: " +peso+ "\n estatura:"+estatura);
       }

       /*  public void calcularImc(){
            imc = peso/(Math.pow(estatura, 2));

            if (imc < 20){
                System.out.println("el peso esta por debajo de lo ideal");
            }
            else if (imc == 20 || imc <=25){
                System.out.println("El peso es ideal");
            }
            else if (imc >25){
                System.out.println("tiene sobrepeso");
            }
        }*/

        public String calcularImc(){
            imc = peso / Math.pow(estatura, 2);
            if(imc < 20){
                resultado = "Peso bajo";
            }
            else if (imc == 20 || imc <=25){
                resultado = "Peso ideal";
            }
            else{
                resultado = "Sobrepeso";
            }

            return resultado;
        }

     public void mayorEdad(){
        if (edad <18){
            System.out.println("usted es menor de edad");
        }
        else if (edad >18){
            System.out.println("usted es mayor de edad");
        }
    }
    
        //reto 3

        public Persona (){

        }
        public Persona (String nombre, String tipodoc,  int edad){
            this.nombre=nombre;
            this.tipodoc=tipodoc;
            this.edad=edad;

        }

        public Persona (int peso){
            this.peso= peso;
        }

        public void mostrarDatos(){
            System.out.println("nombre:"+nombre+ "\n tipo doc: " +tipodoc+ "\n edad: " +edad);
        }
        
        public void mostrarDatos(int peso){
            System.out.println("su peso es de: " +peso);
        }
     
    }
    