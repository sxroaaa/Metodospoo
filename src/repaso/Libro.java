package repaso;
import java.util.Scanner;
public class Libro{

    Scanner leer=new Scanner(System.in);
    //atributos 
    private int idlibro;
    public String nombrelibro;
    private String autorlibro, categoria, editorial;
     //metodos
     public Libro(){


     }

     


    public Libro(int idlibro, String nombrelibro, String autorlibro, String categoria, String editorial){
        this.idlibro=idlibro;
        this.nombrelibro= nombrelibro;
        this.autorlibro=autorlibro;
        this.categoria=categoria;
        this.editorial=editorial;
     }
     public void registrarLibro(){
        System.out.println("ingrese el id del libro");
        idlibro=leer.nextInt();

        leer.nextLine();
        System.out.println("ingrese el nombre del libro");
        nombrelibro=leer.nextLine();

        System.out.println("ingrese el autor del libro");
        autorlibro=leer.nextLine();

        System.out.println("ingrese la categoria del libro");
        categoria=leer.nextLine();

        System.out.println("ingrese la editorial del libro");
        editorial=leer.nextLine();
     }

     public void consultarLibro(String namebook){
        if(nombrelibro.equals(namebook)){
            System.out.println("el libro " +nombrelibro+ " fue escrito por " +nombrelibro+ " es de la editorial " +editorial);
        }

        else{
            System.out.println("el libro no existe");
        }
    }

        public void mostrarLibro(){
            System.out.println("el libro " +nombrelibro+ " fue escrito por " +autorlibro);
        }
        public void mostrarLibro(String nombrelibro, String autorlibro){
        System.out.println("el libro " +nombrelibro+ " fue escrito por " +autorlibro);
        }

    }
     
