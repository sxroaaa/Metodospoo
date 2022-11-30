package Salud;

public class Empleado extends Persona1{
    private int horastrabajadas, valorhora;
    private String departamento, cargo;


    public Empleado(){

    }

    public Empleado (int edad, int horastrabajadas, int valorhora, String tipodoc, String doc, String nombre, String apellido, String sexo, String departamento, String cargo){
        super(nombre, apellido, tipodoc, doc, sexo, edad);
        this.horastrabajadas = horastrabajadas;
        this.valorhora = valorhora;
        this.departamento = departamento;
        this.cargo = cargo;
       
    }
    

    public void setHorastrabajadas(int horastrabajadas){
        this.horastrabajadas=horastrabajadas;
    }

    public int getHorastrabajadas(){
        return horastrabajadas;
    }

    public void setValorhora(int valorhora){
        this.valorhora=valorhora;
    }
    public int getValorhora(){
        return valorhora;
    }

    public void setDepartamento(String departamento){
        this.departamento= departamento;
    }

    public String getDepartamento(){
        return departamento;
    }

    public void setCargo(String cargo){
        this.cargo= cargo;
    }

    public String getCargo(){
        return cargo;
    }



    public void CalcularHonorarios(){
       float honorarios= valorhora*horastrabajadas;
       double reteica= honorarios* 0.00966;
       double total= honorarios-reteica;
    }
}

