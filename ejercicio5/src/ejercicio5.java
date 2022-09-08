import javax.swing.*;

public class ejercicio5 {

    public static void main(String[] args) {
        String ID;
        String Employeed;
        String Salary;
        String Days_lab;
        String Sales;
        String Deduccion;
        double Salary_basic, sales, prest, days_lab, comision;
        int CC;
        double aux_trans = 0;
        double salaryDeven = 0;
        double Total_deducc = 0;
        double Total_deven;
        double SalaryNeto = 0;

        ID = JOptionPane.showInputDialog(null, "Porfavor ingrese numero de cedula: ");
        CC = Integer.parseInt(ID);
        Employeed = JOptionPane.showInputDialog(null, "Porfavor Ingrese Nombre del empleado: ");
        Salary =JOptionPane.showInputDialog(null, "Porfavor Ingrese Salraio basico del empleado: ");
        Salary_basic = Double.parseDouble(Salary);
        Days_lab = JOptionPane.showInputDialog(null, "Porfavor Ingrese dias laborados: " );
        days_lab = Double.parseDouble(Days_lab);
        Sales = JOptionPane.showInputDialog(null, " Porfavor, INgrese ventas generadas: ");
        sales = Double.parseDouble(Sales);
        Deduccion = JOptionPane.showInputDialog("Porfavor, Ingrese prestamos del empleado: ");
        prest = Double.parseDouble(Deduccion);
        salaryDeven = (Salary_basic*days_lab) / 30;
        aux_trans = 70500 * days_lab / 30;
        comision = sales*0.02;
        Total_deven = salaryDeven + comision;
        Total_deducc = prest;

        if (Salary_basic <= 589500*2) {
            Total_deven = Total_deven + aux_trans;
            SalaryNeto = Total_deven - Total_deducc;
        }
        if (Salary_basic > 589500*2) {
            aux_trans = 0;
            SalaryNeto = Total_deven - Total_deducc;
        }

        JOptionPane.showMessageDialog(null, "Cedula del empleado: " + CC +
        "\n Nombre del empleado: " + Employeed + "\n Salario basico: " + Salary_basic
        + "\n Auxilio de Transporte: " + aux_trans + "\n Comision por ventas: " + comision
        + "\n Prestamos: " + prest + "\n Neto a pagar: " + SalaryNeto);
    }
}
