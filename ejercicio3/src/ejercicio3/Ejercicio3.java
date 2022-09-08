import javax.swing.*;

public class ejercisio3 {
    public static void main(String[] args) {
        double sumVal = 0;
        double sumMultre = 0;
        double sumUlticin = 0;
        int Count = 1;
        int Result = 1;

        while (Count <= 10) {
            Result = Count * Count - 2 * Count;
            if ((Result % 3) == 0) {
                JOptionPane.showMessageDialog(null, "Valores de Y multiplos de 3: " + Result);
                sumMultre = sumMultre + Result;
            }
            if ((Result % 5) == 0) {
                if ((Result % 10) == 0) {
                    JOptionPane.showMessageDialog(null, "Valores de Y cuyo ultimo digito es 5:" + Result);
                    sumUlticin = sumUlticin + Result;
                }
            }
            sumVal = sumVal + Result;
            Count = Count + 1;
        }
        JOptionPane.showMessageDialog(null, "Suma de valores de Y cuyo ultimo digito sea 3: "+ sumMultre);
        JOptionPane.showMessageDialog(null, "Suma de los valores de Y cuyo ultimo digito es 5: " + sumUlticin);
        JOptionPane.showMessageDialog(null, "Suma de valores de Y: " + sumVal);
    }
}
