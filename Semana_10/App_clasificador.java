
import java.util.Scanner;

public class App_clasificador {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);

        System.out.println("Indique el valor de su saldo");
        double saldo = leer.nextDouble();
        if (saldo < 0) {
            System.out.println("Cuenta en mora");
        } else if (saldo >= 0 && saldo <= 100000) {
            System.out.println("Cuenta basica");
        } else {
            System.out.println("Cuenta preferencial");
        }

        leer.close();
    }
}
