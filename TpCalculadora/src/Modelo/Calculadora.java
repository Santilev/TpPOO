package modelo;


public class Calculadora {
    private double peso;
    private double altura;

    public Calculadora (double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String obtenerEstado() {
        double imc = calcularIMC();
        if (imc < 18.5) return "Bajo peso";
        else if (imc < 25.0) return "Peso saludable";
        else if (imc < 30.0) return "Sobrepeso";
        else return "Obesidad";
    }

    public String obtenerConsejo() {
        String estado = obtenerEstado();
        return switch (estado) {
            case "Bajo peso" -> "Come más calorías y consulta con un nutricionista.";
            case "Peso saludable" -> " Mantené hábitos saludables.";
            case "Sobrepeso" -> "Cuidá tu alimentación y hacé ejercicio regularmente.";
            case "Obesidad" -> "Consultá con un médico para controlar tu peso.";
            default -> "";
        };
    }
}