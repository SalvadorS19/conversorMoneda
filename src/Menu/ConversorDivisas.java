package Menu;

import Monedas.*;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class ConversorDivisas {
    public static void main(String[] args) {
        // Lista de divisas y sus codigos
        String[] divisas = {"Peso Colombiano (COP)", "Dólar estadounidense (USD)", "Euro (EUR)", "Libra esterlina (GBP)", "Yen japonés (JPY)", "Won Sur Coreano (KRW)"};
        String[] codigoDivisas = {"COP", "USD", "EUR", "GBP", "JPY", "KRW"};

        // Obtener la divisa de origen y la cantidad a convertir
        int divisaOrigen = Arrays.asList(divisas).indexOf(JOptionPane.showInputDialog(null, "Seleccione una opción", "Conversor de divisas", JOptionPane.PLAIN_MESSAGE, null, divisas, divisas[0]));
        String cantidadOrigenStr = JOptionPane.showInputDialog(null, "Ingrese la cantidad a convertir:", "Conversor de divisas", JOptionPane.PLAIN_MESSAGE);

        if(!cantidadOrigenStr.matches("[+-]?\\d*(\\.\\d+)?")){
            JOptionPane.showMessageDialog(null, "Debe ingresar un valor valido", "Conversor de divisas", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        // Obtener la divisa de destino
        int divisaDestino = Arrays.asList(divisas).indexOf(JOptionPane.showInputDialog(null, "Seleccione una opción", "Conversor de divisas", JOptionPane.PLAIN_MESSAGE, null, divisas, divisas[0]));

        double cantidadOrigen = Double.parseDouble(cantidadOrigenStr);
        double cantidadDestino = 0;

        switch (codigoDivisas[divisaOrigen]){
            case "COP":
                cantidadDestino = new PesoCol().convertirA(codigoDivisas[divisaDestino], cantidadOrigen);
                break;
            case "USD":
                cantidadDestino = new Dolar().convertirA(codigoDivisas[divisaDestino], cantidadOrigen);
                break;
            case "EUR":
                cantidadDestino = new Euro().convertirA(codigoDivisas[divisaDestino], cantidadOrigen);
                break;
            case "GBP":
                cantidadDestino = new LibraEsterlina().convertirA(codigoDivisas[divisaDestino], cantidadOrigen);
                break;
            case "JPY":
                cantidadDestino = new YenJapones().convertirA(codigoDivisas[divisaDestino], cantidadOrigen);
                break;
            case "KRW":
                cantidadDestino = new WonSurCoreano().convertirA(codigoDivisas[divisaDestino], cantidadOrigen);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Conversion invalida", "Conversor de divisas", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
        // Mostrar el resultado de la conversión
        JOptionPane.showMessageDialog(null, cantidadOrigen + " " + divisas[divisaOrigen] + " = " + cantidadDestino + " " + divisas[divisaDestino], "Conversor de divisas", JOptionPane.INFORMATION_MESSAGE);
    }
}
