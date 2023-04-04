package Menu;

import Monedas.*;
import Temperaturas.Celsius;
import Temperaturas.Fahrenheit;
import Temperaturas.Kelvin;
import Temperaturas.Temperatura;

import javax.swing.*;
import java.util.Arrays;

public class ConversorTemperaturas {
    public static void main(String[] args) {
        // Lista de divisas y sus codigos
        String[] temperaturas = {"Celsius", "Fahrenheit", "Kelvin"};
        String[] codigoTemperaturas = {"C", "F", "K", "R"};

        // Obtener la temperatura de origen y los grados a convertir
        int tempOrigen = Arrays.asList(temperaturas).indexOf(JOptionPane.showInputDialog(null, "Seleccione la temperatura inicial:", "Conversor de temperaturas", JOptionPane.PLAIN_MESSAGE, null, temperaturas, temperaturas[0]));
        String gradosTempStr = JOptionPane.showInputDialog(null, "Ingrese la temperatura en grados:", "Conversor de temperaturas", JOptionPane.PLAIN_MESSAGE);

        if(!gradosTempStr.matches("[+-]?\\d*(\\.\\d+)?")){
            JOptionPane.showMessageDialog(null, "El valor ingresado no es un número", "Conversor de temperaturas", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        double gradosTempOrigen = Double.parseDouble(gradosTempStr);
        double gradosTempDestino = 0;

        // Obtener la temperatura destino
        int tempDestino = Arrays.asList(temperaturas).indexOf(JOptionPane.showInputDialog(null, "Seleccione la temperatura final:", "Conversor de temperaturas", JOptionPane.PLAIN_MESSAGE, null, temperaturas, temperaturas[0]));

        if(tempOrigen == tempDestino){
            JOptionPane.showMessageDialog(null, "Conversion invalida", "Conversor de temperaturas", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        switch (codigoTemperaturas[tempOrigen]){
            case "C":
                gradosTempDestino = new Celsius().convertirA(codigoTemperaturas[tempDestino], gradosTempOrigen);
                break;
            case "F":
                gradosTempDestino = new Fahrenheit().convertirA(codigoTemperaturas[tempDestino], gradosTempOrigen);
                break;
            case "K":
                gradosTempDestino = new Kelvin().convertirA(codigoTemperaturas[tempDestino], gradosTempOrigen);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Conversion invalida", "Conversor de temperaturas", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
        // Mostrar el resultado de la conversión
        JOptionPane.showMessageDialog(null, gradosTempOrigen + " " + temperaturas[tempOrigen] + " = " + gradosTempDestino + " " + temperaturas[tempDestino], "Conversor de temperaturas", JOptionPane.INFORMATION_MESSAGE);
    }
}
