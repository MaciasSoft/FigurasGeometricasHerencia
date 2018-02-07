package macias.nelson;

import java.util.*;

public class Rectangulo extends Figura {


    /*public Rectangulo(int base, int altura) {
        /*this.base = base;
        this.altura = altura;*/
    public Rectangulo(int base, int altura) {
        super(base, altura);

    }
    public double obtenerArea() {
        return base * altura;
    }

}

   /* public int calcularPerimetro() {
        Scanner sc = new Scanner(System.in);
        //int base, altura, perimetro;
        int perimetro;
        System.out.println("Ingresa la base de perimetro del Rectangulo");
        base = sc.nextInt();
        System.out.println("Ingresa la altura de perimetro del Rectangulo");
        altura = sc.nextInt();
        perimetro = (altura*2)+(base*2);
        return perimetro;
    }
    public int calcularArea()
    {
        Scanner sc1 = new Scanner(System.in);
        int area;
        System.out.println("Ingresa base del Area del Rectangulo:");
        base = sc1.nextInt();
        System.out.println("Ingresa altura del Area del Rectangulo");
        altura = sc1.nextInt();
        area= altura*base;
        return area;
    }*/

