import javax.swing.*;

public class ejercisio4 {
    public static void main(String[] args) {
        String Data;
        double num = 0;
        double sum = 0;
        double val1, val2, val3, val4;

        Data = JOptionPane.showInputDialog("' Ingrese un numero, para imprimir la suma de sus digitos.");
        num = Double.parseDouble(Data);

        val1 = num / 10;
        val2 = num % 10;
        sum = sum + val2;
        val1 = val1 - (val2 * 0.1);

        while (val1 > 0) {
            val3 = val1 / 10;
            val4 = val1 % 10;
            sum = sum + val4;
            val1 = val3 - (val4 * 0.1);
        }
        JOptionPane.showMessageDialog(null, "El numero ingresado fue " + num + "y la suma de sus digitos es " + sum);
    }
}