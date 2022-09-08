import javax.swing.*;

public class ejercicio8 {
    public static void main(String[] args) {
        String minute;
        int min;
        int valueMin = 200;
        int add = 30;

        minute = JOptionPane.showInputDialog(null, "Porfavor ingrese los minutos: ");
        min = Integer.parseInt(minute);
        if (min <= 3) {
            valueMin = min * valueMin;
        }
        if (min > 3) {
            valueMin = valueMin + add;
            valueMin = min * valueMin;
        }
        JOptionPane.showMessageDialog(null, "El valor de su llamada es: " + valueMin + "\n" + "Y la cantidad de minutos que hablo fue de: " + min);

    }
}