import java.util.Scanner;

public class Censo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPersonas = 0;
        int totalHombres = 0;
        int totalMujeres = 0;
        int hombres16a65 = 0;
        int docMayorEdad = 0;
        int edadMayor = 0;
        char sexoMayor = ' ';
        while (true) {
            System.out.print("Ingrese número de documento (0 para terminar): ");
            int documento = scanner.nextInt();
            if (documento == 0) {
                break;
            }

            System.out.print("Ingrese edad: ");
            int edad = scanner.nextInt();

            System.out.print("Ingrese sexo (M/F): ");
            char sexo = scanner.next().toUpperCase().charAt(0);

            totalPersonas++;

            if (sexo == 'M') {
                totalHombres++;
                if (edad >= 16 && edad <= 65) {
                    hombres16a65++;
                }
            } else if (sexo == 'F') {
                totalMujeres++;
            }

            if (edad > edadMayor) {
                edadMayor = edad;
                docMayorEdad = documento;
                sexoMayor = sexo;
            }

            System.out.println();
        }

        scanner.close();

        double porcentaje = 0;
        if (totalHombres > 0) {
            porcentaje = ((double) hombres16a65 / totalHombres) * 100;
        }

        // Mostrar resultados
        System.out.println("----- Resultados del Censo -----");
        System.out.println("Total de personas censadas: " + totalPersonas);
        System.out.println("Cantidad de varones: "       + totalHombres);
        System.out.println("Cantidad de mujeres: "      + totalMujeres);
        System.out.println("Porcentaje de varones entre 16 y 65 años: " 
                           + String.format("%.2f", porcentaje) + "%");

        if (docMayorEdad != 0) {
            System.out.println("\nPersona de mayor edad:");
            System.out.println("  Documento: " + docMayorEdad);
            System.out.println("  Edad:      " + edadMayor);
            System.out.println("  Sexo:      " + sexoMayor);
        } else {
            System.out.println("No se ingresaron datos de personas.");
        }
    }
}