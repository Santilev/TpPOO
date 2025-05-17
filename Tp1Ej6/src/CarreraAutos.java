import java.util.Scanner;

public class CarreraAutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mejorVehiculo = 0;
        double mejorTiempo = Double.MAX_VALUE;

        for (int i = 1; i <= 12; i++) {
            System.out.println("Competidor " + i);
            System.out.print("  Ingrese numero de vehiculo: ");
            int vehiculo = scanner.nextInt();
            System.out.print("  Ingrese tiempo (en segundos): ");
            double tiempo = scanner.nextDouble();
 
            if (tiempo < mejorTiempo) {
                mejorTiempo = tiempo;
                mejorVehiculo = vehiculo;
            }
        }

        System.out.println("\n=== Resultado ===");
        System.out.println("Mejor tiempo: " + mejorTiempo + " segundos");
        System.out.println("Vehículo ganador: " + mejorVehiculo);

        scanner.close();
    }
}