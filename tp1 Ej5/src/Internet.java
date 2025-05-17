import java.util.Scanner;

public class Internet {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cantidadClientes = 5;

        for (int i = 0; i < cantidadClientes; i++) {
            System.out.println("Cliente número " + (i + 1));

           
            System.out.print("Ingrese el DNI del cliente: ");
            String dni = entrada.nextLine();

            
            System.out.println("Elige el tipo de servicio:");
            System.out.println("1. Internet 30 megas ($750)");
            System.out.println("2. Internet 50 megas ($1100)");
            System.out.println("3. Internet 100 megas ($1500 con 5% de descuento)");

            int tipoServicio = entrada.nextInt();
            entrada.nextLine();

            double monto = 0;

            if (tipoServicio == 1) {
                monto = 750;
            } else if (tipoServicio == 2) {
                monto = 1100;
            } else if (tipoServicio == 3) {
                monto = 1500 * 0.95; 
            } else {
                System.out.println("Tipo de servicio inválido. Se le asignará $0.");
            }

            System.out.println("DNI del cliente: " + dni);
            System.out.println("Tipo de servicio elegido: " + tipoServicio);
            System.out.println("Monto a pagar: $" + monto);
        }

        entrada.close();
    }
}