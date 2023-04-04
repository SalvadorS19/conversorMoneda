import Menu.ConversorDivisas;
import Menu.ConversorTemperaturas;

import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] conversiones = {"Divisas", "Temperatura"};
        boolean continuar = true;

        while(continuar){
            String tipoConversion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Menú principal", JOptionPane.PLAIN_MESSAGE, null, conversiones, conversiones[0]);
            if(tipoConversion.equals("Divisas")){
                ConversorDivisas menu = new ConversorDivisas();
                menu.main(args);
            }
            else {
                ConversorTemperaturas menu = new ConversorTemperaturas();
                menu.main(args);
            }
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Fin del programa", JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.NO_OPTION) {
                continuar = false;
            }
        }
        JOptionPane.showMessageDialog(null, "Programa finalizado", "Fin del programa", JOptionPane.INFORMATION_MESSAGE);
    }
}
