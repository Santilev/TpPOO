import java.util.Scanner; 

public class Productos{

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print ("Ingrese la cantidad de productos");
       int n = scanner.nextInt();
       int[] cantidades = new int[n];
       double[] costos = new double[n];
       
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la cantidad del producto " + (i + 1) + ": ");
            cantidades[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el costo unitario del producto " + (i + 1) + ": ");
            costos[i] = scanner.nextDouble();
        }
        double sumaTotal = 0;

        System.out.println("Productos cuyo precio total supera los 1000 pesos:");

        for (int i = 0; i < n; i++) {
            double precioT = cantidades[i] * costos[i];
            sumaTotal = sumaTotal + precioT;

            if (precioT > 1000) {
                System.out.println("El precio total del producto numero " + (i + 1) + " supera los 1000 pesos y es: " + precioT + " pesos");
            }
        }

        System.out.println("La suma total de todos los productos es: " + sumaTotal + " pesos");

       
    }
}
    
   
    
    
    
    
}
