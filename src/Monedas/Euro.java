package Monedas;

import javax.swing.*;

public class Euro implements Moneda{
    double cambioPesoCol = 5042.39;
    double cambioDolar = 1.08;
    double cambioLibraEsterlina = 0.88;
    double cambioYenJapones = 144.38;
    double cambioWonSurCoreano = 1415.31;
    @Override
    public double convertirA(String moneda, double cantidad) {
        double conversion = 0;
        switch (moneda){
            case "COP":
                conversion = cantidad * cambioPesoCol;
                break;
            case "USD":
                conversion = cantidad * cambioDolar;
                break;
            case "GBP":
                conversion = cantidad * cambioLibraEsterlina;
                break;
            case "JPY":
                conversion = cantidad * cambioYenJapones;
                break;
            case "KRW":
                conversion = cantidad * cambioWonSurCoreano;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Conversion invalida", "Conversor de divisas", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
        return conversion;
    }
}
