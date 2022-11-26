import repaso.Libro;
public class App {


    public static void main(String[] args) throws Exception {
        Libro libro1=new Libro();

       libro1.registrarLibro();

       libro1.consultarLibro("cien años de soledad ");

     

      Libro libro2=new Libro(988796, "2000 lenguas de viaje submarino", "julo verne", "ciencia ficcion", "planeta");

      
    }

   
}