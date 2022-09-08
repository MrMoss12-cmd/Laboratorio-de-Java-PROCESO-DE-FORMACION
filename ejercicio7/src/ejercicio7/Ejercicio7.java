import javax.swing.*;

public class ejercicio7 {
    public static void main(String[] args) {
        String age, age1;
        int count = 1;
        int count1 = 1;
        int ageH = 1;
        int ageM = 1;
        int age_young = 1000;
        double prome_ageH = 0;
        double prome_ageM = 0;
        int cantHome = 0;
        int cantMuj = 0;
        int cantPeople;
        int sumH = 0;
        int sumM = 0;

        JOptionPane.showMessageDialog(null, "Porfavor Ingrese las edades de los hombres que iran a la fiesta: ");
        while (ageH != 0){
            age = JOptionPane.showInputDialog(null, "La Edad del hombre " + count+ ":");
            ageH = Integer.parseInt(age);
            if (ageH >= 18) {
                if (ageH < age_young) {
                    age_young = ageH;
                }
                cantHome++;
                count++;
                sumH = sumM + ageH;
            } else {
                JOptionPane.showMessageDialog(null, "No pueden ingresar menores a la fiesta.","Error",0);
                JOptionPane.showMessageDialog(null, "Porfavor ingrese las edades de las mujeres que iran a la fiesta: ");
                while (ageM != 0) {
                    age1 = JOptionPane.showInputDialog(null, "La Edad de la mujer " + count1 + ":");
                    ageM = Integer.parseInt(age1);
                    if (ageM >= 18) {
                        if (ageM < age_young) {
                            age_young = ageM;
                        }
                        cantMuj++;
                        count1++;
                        sumM = sumM + ageM;
                    } else {
                        JOptionPane.showMessageDialog(null, "No pueden ingresar menores a la fiesta.", "Error", 0);
                        prome_ageH = sumH / cantHome;
                        prome_ageM = sumM / cantMuj;
                        cantPeople = cantHome + cantMuj;

                        JOptionPane.showMessageDialog(null, "El total de personas que fueron a la fiesta es: " + cantPeople + "\n" +
                                "Total de hombres: " + cantHome + "\n" +
                                "Total de mujeres: " + cantMuj + "\n" +
                                "El promedio de edad de hombres fue: " + prome_ageH + "\n" +
                                "El promedio de edad de mujeres fue: " + prome_ageM + "\n" +
                                "La edad mas joven fue: " + age_young);
                    }
            }
        }

        }

    }
}

