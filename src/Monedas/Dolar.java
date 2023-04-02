package Monedas;

public class Dolar implements Moneda{
    double cambioPesoCol = 4654.63;
    double cambioEuro = 0.92;
    double cambioLibraEsterlina = 0.81;
    double cambioYenJapones = 133.33;
    double cambioWonSurCoreano = 1306.47;
    @Override
    public double convertirA(String moneda, double cantidad) {
        double conversion = 0;
        switch (moneda){
            case "COP":
                conversion = cantidad * cambioPesoCol;
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
                System.out.println("Internal Error: Conversion invalida");
                break;
        }
        return conversion;
    }
}
