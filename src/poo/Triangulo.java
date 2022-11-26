package poo;

public class Triangulo extends Figuras {
    private float base, altura;

    public Triangulo() {
    }


    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

     public float getBase() {
        return base;
    }


    public void setBase(float base) {
        this.base = base;
    }


    public float getAltura() {
        return altura;
    }


    public void setAltura(float altura) {
        this.altura = altura;
    }


    @Override
    public void calcularArea(){
        float area=(base*altura) /2;
        System.out.println("el area del triagulo de base " +base+ "y altura " +altura+ " es " +area);
    }

}
