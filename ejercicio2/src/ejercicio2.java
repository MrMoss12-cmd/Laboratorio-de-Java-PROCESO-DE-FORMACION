import java.util.Scanner;

public class ejercisio2 {
    public static void main(String[] args) {
        Scanner NumKil = new Scanner(System.in);
        System.out.println("Ingrese el numero de kilos de manzanas comprados porfavor: ");
        double ManKil = Double.parseDouble(NumKil.nextLine());
        double valMan = ManKil * 4200;

        if (ManKil == 0 && ManKil <= 2) {
            double descMan = ((0 * valMan) / 100);
            double totalTopay = valMan - descMan;
            System.out.println("La compra de: " + ManKil + " Kilos tiene un valor de: $" + valMan);
            System.out.println("pero usted tiene un descuento por valor de $" + descMan);
            System.out.println("por lo tanto el valor a pagar es: $" + totalTopay);
        }

        if (ManKil >= 2.01 && ManKil <= 5.0) {
            double descMan = (( 10 * valMan)/ 100 );
            double totalTopay = valMan - descMan;
            System.out.println("La compra de: " + ManKil + " Kilos tiene un valor de: $" + valMan);
            System.out.println("pero usted tiene un descuento por valor de $" + descMan);
            System.out.println("por lo tanto el valor a pagar es: $" + totalTopay);
        }

        if (ManKil >= 5.01  && ManKil <= 10) {
            double descMan = ((15 * valMan) / 100);
            double totalTopay = valMan - descMan;
            System.out.println("La compra de: " + ManKil + " Kilos tiene un valor de: $" + valMan);
            System.out.println("pero usted tiene un descuento por valor de $" + descMan);
            System.out.println("por lo tanto el valor a pagar es: $" + totalTopay);
        }

        if (ManKil >= 10.01) {
            double descMan = (( 15 * valMan) / 100);
            double totalTopay = valMan - descMan;
            System.out.println("La compra de: " + ManKil + " Kilos tiene un valor de: $" + valMan);
            System.out.println("pero usted tiene un descuento por valor de $" + descMan);
            System.out.println("por lo tanto el valor a pagar es: $" + totalTopay);

        }

    }
}