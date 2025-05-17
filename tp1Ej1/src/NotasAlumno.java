import java.util.Scanner; 

public class NotasAlumno {
    public static void main(String[] args) {
      
       Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese la cantidad de notas: ");
            int cantidad = scanner.nextInt();
           double[] notas = new double[cantidad];
            
            for (int i = 0; i < cantidad; i++) {
                System.out.print("Ingrese la nota #" + (i + 1) + ": ");
                notas[i] = scanner.nextDouble();
            }

            double notaMaxima = notas[0];
            double suma = 0;
            
            for (int i = 0; i < cantidad; i++) {
                if (notas[i] > notaMaxima) {
                    notaMaxima = notas[i];
                }
                suma += notas[i];
            }
            
            double promedio = suma / cantidad;
            
            
            System.out.println("La nota más alta es: " + notaMaxima);
            System.out.println("El promedio de notas es: " + promedio);
         scanner.close(); 
    }
}