package Monedas;

import javax.swing.*;

public class WonSurCoreano implements Moneda{
    double cambioPesoCol = 3.56;
    double cambioDolar = 0.00077;
    double cambioLibraEsterlina = 0.00062;
    double cambioEuro = 0.00071;
    double cambioYenJapones = 0.10;
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
            case "JPY":
                conversion = cantidad * cambioYenJapones;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Conversion invalida", "Conversor de divisas", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
        return conversion;
    }
}
