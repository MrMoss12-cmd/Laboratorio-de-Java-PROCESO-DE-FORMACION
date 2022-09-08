import java.util.Scanner;

public class ejercisio1 {
    public static void main(String[] args) {
        Scanner  NumDep = new Scanner(System.in);
        System.out.println("Ingrese cuantia del deposito porfavor: ");
        double CuanDep = Double.parseDouble(NumDep.nextLine());


        double valFut = CuanDep * (1 + (60 * 0.2));
        System.out.println("La cuantia depositada fue: " + CuanDep);
        System.out.println("El Valor Futuro en 5 anos es : " + valFut);

    }
}
