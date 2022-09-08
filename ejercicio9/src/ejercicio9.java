import javax.swing.*;

public class ejercicio9 {
    public static void main(String[] args) {
        String note;
        int count = 1;
        int accumu = 0;
        int accumu1 = 0;
        int accumu2 = 0;
        int accumu3 = 0;
        int calificaccion;

        while (count <= 10) {
            note = JOptionPane.showInputDialog(null, "La calificasion obtenida por el estudiante es: " + count);
            calificaccion = Integer.parseInt(note);
            count = count + 1;
            if (calificaccion > 0 && (calificaccion <= 100)) {
                if (calificaccion < 50) {
                    accumu = accumu + 1;
                } if (calificaccion >= 50 && (calificaccion < 70)){
                    accumu1 = accumu1 + 1;
                } if (calificaccion >= 70 && (calificaccion < 80)){
                    accumu2 = accumu2 + 1;
                } if (calificaccion > 80) {
                    accumu3 = accumu3 + 1;
                }
            } else {
                JOptionPane.showMessageDialog(null, "La caficasion debe ser entre 1 y 100", "Error", 3);
            }
        }
        JOptionPane.showMessageDialog(null, "La cantidad de estudiantes que obtubieron una califiacion menor a 50: " + accumu + "\n" +
                "La cantidad de estudiantes que obtubieron una nota entre 50 y 70: " + accumu1 + "\n" +
                "La cantidad de estudiantes que obtubieron una nota entre 70 y 80: " + accumu2 + "\n" +
                "La cantidad de estudiantes que obtubieron una nota mayor a 80: " + accumu3);
    }
}
