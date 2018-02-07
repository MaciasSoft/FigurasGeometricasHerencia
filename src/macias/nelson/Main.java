package macias.nelson;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*Rectangulo perimetro = new Rectangulo(4, 5);
        Rectangulo area = new Rectangulo(4, 5);
        int num = perimetro.calcularPerimetro();

        System.out.println(num);

        int num1=area.calcularArea();
        System.out.println(num1);*/
        Figura rectangulo;
        Figura circulo;
        Figura cuadrado;
        int cont = 0, b = 0, a = 0, l = 0;
        int r = 0;
        Scanner scanner = new Scanner(System.in);
        //System.out.print((char)27 + "[34m");
        System.out.println("Calcular Area:");
        System.out.println("Ingrese Digito para Calcular Area:"+(char)27+"[34m 1=Rectangulo, 2=Circulo, 3=Cuadrado");
        String num = scanner.nextLine();
        cont = Integer.parseInt(num);
        switch (cont) {
            case 1:
                System.out.print("Ingrese la base: ");
                String valor = scanner.nextLine();
                b = Integer.parseInt(valor);

                System.out.print("Ingrese la altura : ");
                valor = scanner.nextLine();
                a = Integer.parseInt(valor);
                rectangulo = new Rectangulo(b, a);
                System.out.println("El area del rectangulo es: " + rectangulo.obtenerArea());
                break;
            case 2:
                System.out.print("Ingrese el radio : ");
                String val = scanner.nextLine();
                r = Integer.parseInt(val);
                circulo = new Circulo(r);
                System.out.println("El area del circulo es: " + circulo.obtenerArea());
                break;
            case 3:
                System.out.print("ingrese el lado : ");
                String valo = scanner.nextLine();
                l = Integer.parseInt(valo);
                cuadrado = new Cuadrado(l);
                System.out.println("El area del cuadrado es: " + cuadrado.obtenerArea());
                break;



        }

    }
}
