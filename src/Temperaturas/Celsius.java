package Temperaturas;

import javax.swing.*;

public class Celsius implements Temperatura{
    public double convertirA(String codigoTemp, double grados){
        double conversion = 0;
        switch (codigoTemp){
            case "F":
                conversion = (grados * 1.8) + 32;
                break;
            case "K":
                conversion = grados + 273.15;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Conversion invalida", "Conversor de temperaturas", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
        return conversion;
    }
}
