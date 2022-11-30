package Salud;
import java.util.Scanner;
public class Persona1{
    private String tipodoc, doc, nombre, apellido, sexo, resultado;
    private int edad;
    private double peso, estatura, imc;
    Scanner leer=new Scanner(System.in);
   

    public Persona1(){

    }
    
    public Persona1 (String nombre, String apellido, String tipodoc, String doc, String sexo, int edad){
        this.nombre=nombre;
        this.tipodoc=tipodoc;
        this.edad=edad;
        this.doc= doc;
        this.sexo= sexo;
        this.edad=edad;

    }

    public Persona1 (int peso){
        this.peso= peso;
    }

    public void mostrarDatos(){
        System.out.println("nombre:"+nombre+ "\n tipo doc: " +tipodoc+ "\n edad: " +edad);
    }
    
    public void mostrarDatos(int peso){
        System.out.println("su peso es de: " +peso);
    }
 
    
    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void pedirDatos(){
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
    
}     
    
