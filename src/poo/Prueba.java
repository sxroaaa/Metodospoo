package poo;
import java.util.Scanner;
public class Prueba {


    public static void main(String[] args) {
     Scanner leer=new Scanner(System.in);
    String op;
    System.out.println("elija una opcion:\n a.cuadrado\n b.Triangulo \n c.Circulo \n d.Rectangulo ");
    op=leer.nextLine();
    switch(op){
        case "a": 
            Cuadrado c1=new Cuadrado();
            System.out.println("ingrese el lado del cuadrado");
            float l=leer.nextFloat();
            c1.setLado(l);
            c1.calcularArea();
        break;
 
        case "b":
            Triangulo t1=new Triangulo();
            float base, altura;
            System.out.println("ingrese la base del triagulo");
            base=leer.nextFloat();
            t1.setBase(base);
            System.out.println("ingrese la altura del cuadrado");
            altura=leer.nextFloat();
            t1.setAltura(altura);
            t1.calcularArea();
        break;
         
        case "c":
            Circulo c2=new Circulo();
            float r;
            System.out.println("ingrese el radio del circulo");
            r=leer.nextFloat();
            c2.setRadio(r);
            c2.calcularArea();

        break;
        case "d":
            Rectangulo r1=new Rectangulo();
            Float a, b;
            System.out.println("ingrese la altura del rectangulo");
            a=leer.nextFloat();
            r1.setAltura(a);
            System.out.println("ingrese la base del rectangulo");
            b=leer.nextFloat();
            r1.setBase(b);
            r1.calcularArea();
        break;

        
    }
    leer.close();
    }
}
