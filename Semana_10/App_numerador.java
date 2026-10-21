
import java.util.Scanner;

public class App_numerador {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int numeriIngresado;

        do { 
            System.out.println("Ingrese un valor estrictamente positivo");
            numeriIngresado = lector.nextInt();

            if (numeriIngresado <= 0) {
                System.out.println("Error, el numero debe ser mayor a cero");
            }
        } while (numeriIngresado <= 0);

        System.out.println("Correcto, Valor numerico valido" + numeriIngresado );
        
    lector.close();
    }
}
