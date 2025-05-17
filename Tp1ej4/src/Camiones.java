import java.util.Scanner;

public class Camiones {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int cantidadCamiones = 30;
        String[] patentes = new String[cantidadCamiones];
        String[] choferes = new String[cantidadCamiones];
        String[] cargas = new String[cantidadCamiones];
        String[] horas = new String[cantidadCamiones];

        int contadorTe = 0;

        
        for (int i = 0; i < cantidadCamiones; i++) {
            System.out.println("Camion numero " + (i + 1));

            System.out.print("Ingrese la patente: ");
            patentes[i] = scanner.nextLine();

            System.out.print("Ingrese el nombre y apellido del chofer: ");
            choferes[i] = scanner.nextLine();

            System.out.print("Ingrese el tipo de carga (madera, yerba o te): ");
            cargas[i] = scanner.nextLine();
            System.out.print("Ingrese la hora de egreso : ");
            horas[i] = scanner.nextLine();

            if (cargas[i].equals("te")) {
                contadorTe++;
            }
        }
        System.out.println("Datos de los camiones:");
        for (int i = 0; i < cantidadCamiones; i++) {
            System.out.println("-----------------------------");
            System.out.println("Camión #" + (i + 1));
            System.out.println("Patente: " + patentes[i]);
            System.out.println("Chofer: " + choferes[i]);
            System.out.println("Carga: " + cargas[i]);
            System.out.println("Hora de egreso: " + horas[i]);
        }

        // Mostrar cuántos transportan té
        System.out.println("Cantidad de camiones que llevan té: " + contadorTe);

        scanner.close();
    }
}
