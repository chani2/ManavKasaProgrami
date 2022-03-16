import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Degiskenler olustur
        double  Armut,Elma, Domates, Muz, Patlican;
        double a = 2.14;
        double e = 3.67;
        double d = 1.11;
        double p = 5.00;
        double m = 0.95;


        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kac Kilo ? :");
        Armut = input.nextInt();

        System.out.print("Elma Kac Kilo ? :");
        Elma = input.nextInt();

        System.out.print("Domates Kac Kilo ? :");
        Domates = input.nextInt();

        System.out.print("Muz Kac Kilo ? :");
        Muz = input.nextInt();

        System.out.print("Patlican Kac Kilo ? :");
        Patlican = input.nextInt();
        double toplam = Armut*a + Elma*e + Domates*d + Muz*m + Patlican*p;
        System.out.print("Toplam tutar: " + toplam);

























    }
}
