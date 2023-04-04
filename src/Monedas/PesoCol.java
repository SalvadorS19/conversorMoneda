package Monedas;

import javax.swing.*;

public class PesoCol implements Moneda{
    double cambioDolar = 0.00021;
    double cambioEuro = 0.00020;
    double cambioLibraEsterlina = 0.00017;
    double cambioYenJapones = 0.029;
    double cambioWonSurCoreano = 0.28;
    @Override
    public double convertirA(String moneda, double cantidad) {
        double conversion = 0;
        switch (moneda){
            case "USD":
                conversion = cantidad * cambioDolar;
                break;
            case "EUR":
                conversion = cantidad * cambioEuro;
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
