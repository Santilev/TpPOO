package controlador;

import modelo.Calculadora;
import Vista.CalculadoraVentana;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorIMC implements ActionListener {
    private final CalculadoraVentana vista;

    public ControladorIMC(CalculadoraVentana vista) {
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double peso = Double.parseDouble(vista.getPeso());
            double altura = Double.parseDouble(vista.getAltura());

           Calculadora imc = new Calculadora(peso, altura);
            double valor = imc.calcularIMC();
            String estado = imc.obtenerEstado();
            String consejo = imc.obtenerConsejo();

            String resultado = String.format("Tu IMC es: %.2f\nEstado: %s\nConsejo: %s", valor, estado, consejo);
            vista.mostrarResultado(resultado);
        } catch (NumberFormatException ex) {
            vista.mostrarResultado("Error: Ingresá solo números válidos.");
        }
    }
}
