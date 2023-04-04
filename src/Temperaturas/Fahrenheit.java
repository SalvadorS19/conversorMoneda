package Temperaturas;

import javax.swing.*;

public class Fahrenheit implements Temperatura {
    public double convertirA(String codigoTemp, double grados){
        double conversion = 0;
        switch (codigoTemp){
            case "C":
                conversion = (grados - 32) / 1.8;
                break;
            case "K":
                conversion = (5/9) * (grados - 32) + 273.15;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Conversion invalida", "Conversor de temperaturas", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
        return conversion;
    }
}
