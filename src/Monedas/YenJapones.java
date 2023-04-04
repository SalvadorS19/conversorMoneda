package Monedas;

import javax.swing.*;

public class YenJapones implements Moneda{
    double cambioPesoCol = 34.94;
    double cambioDolar = 0.0075;
    double cambioLibraEsterlina = 0.0061;
    double cambioEuro = 0.0069;
    double cambioWonSurCoreano = 9.81;
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
            case "EUR":
                conversion = cantidad * cambioEuro;
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
