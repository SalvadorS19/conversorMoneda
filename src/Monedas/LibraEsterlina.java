package Monedas;

public class LibraEsterlina implements Moneda{
    double cambioPesoCol = 5730.29;
    double cambioDolar = 1.23;
    double cambioYenJapones = 164.03;
    double cambioEuro = 1.14;
    double cambioWonSurCoreano = 1608.39;
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
            case "JPY":
                conversion = cantidad * cambioYenJapones;
                break;
            case "EUR":
                conversion = cantidad * cambioEuro;
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
