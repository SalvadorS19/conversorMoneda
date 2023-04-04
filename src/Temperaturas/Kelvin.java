package Temperaturas;

import javax.swing.*;

public class Kelvin implements Temperatura {
    public double convertirA(String codigoTemp, double grados){
        double conversion = 0;
        switch (codigoTemp){
            case "C":
                conversion = grados - 273.15;
                break;
            case "F":
                conversion = 1.8 * (grados - 273.15) + 32;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Conversion invalida", "Conversor de temperaturas", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
        return conversion;
    }
}
