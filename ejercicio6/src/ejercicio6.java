import javax.swing.*;

public class ejercicio6 {
    public static void main(String[] args){
        int count = 0;
        int sum = 0;
        int series = 0;

        while (count <= 20) {
            JOptionPane.showMessageDialog(null, "La serie es: " + series);
            count = count + 1;
            series = series + count;

        }
    }
}