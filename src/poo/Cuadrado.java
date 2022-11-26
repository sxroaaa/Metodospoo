package poo;

public class Cuadrado extends Figuras {
    private float lado;

    

    public Cuadrado() {
    }
    
    

    public Cuadrado(float lado) {
        this.lado = lado;
    }



    public float getLado() {
        return lado;
    }


    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        float area= lado*lado;
        System.out.println("El area del cuadrado de lado " +lado+ " es " +area);
    }
    
}
