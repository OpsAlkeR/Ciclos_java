
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cc = 1042732329;
        int numeroDocumento;

        System.out.println("Digite su numero de documento");
        numeroDocumento = sc.nextInt();

        if (numeroDocumento == cc) {
            System.out.println("Bienvenido al portal de busqueda");
        }

        else {
            System.out.println("Ususario inexistente");
        }

        sc.close();
    }
}
