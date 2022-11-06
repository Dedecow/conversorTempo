import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        int horas, minutos, segundos;
        double x,y,z,a, b;

        z = sc.nextDouble();
        //System.out.print("o número digitado foi " + z);
        x = z / 3600;
        y = z % 3600;
        //System.out.printf(" Esse número dividido por 3600 corresponde a %.0f", x);
        //System.out.print(" E o resto é " + y);
        a = y / 60;
        b = y % 60;
        //System.out.printf(" Se pegarmos o resto %.0f e dividirmos por 60 temos %.0f ", y, a);
        //System.out.println(" O resto é " + b);

        //System.out.println( "### magia acontecendo ###");
        horas = (int) x;
        minutos = (int) a;
        segundos = (int) b;

        System.out.print(horas);
        System.out.print(":");
        System.out.print(minutos);
        System.out.print(":");
        System.out.print(segundos);

        sc.close();
    }
}