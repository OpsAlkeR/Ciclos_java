import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        /*
         * int edad;
         * int edadNinio = 12;
         * int edadJoven = 18;
         * 
         * System.out.println("¿Cual es su edad?");
         * edad = leer.nextInt();
         * 
         * if (edad < edadNinio) {
         * System.out.println("Carril niño");
         * } else if (edad < edadJoven) {
         * System.out.println("Carril joven");
         * } else {
         * System.out.println("Carril adulto");
         * }
         */

        int opcion = 0;

        do {
            System.out.println("1. Ingresar producto");
            System.out.println("2. Vender producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Finalizar \n");
            opcion = leer.nextInt();

            if (opcion == 1) {
                System.out.println("haz seleccionado la opcion 1");
            } else if (opcion == 2) {
                System.out.println("haz seleccionado la opcion 2");
            } else if (opcion == 3) {
                System.out.println("haz seleccionado la opcion 3");
            } else {

            }
            switch (opcion) {
                case 1:
                    System.out.println("haz seleccionado la opcion 1");
                case 2:
                    System.out.println("haz seleccionado la opcion 2");
                case 3:
                    System.out.println("haz seleccionado la opcion 3");
                case 4:
                    System.out.println("haz seleccionado la opcion 4");

            }
        } while (opcion != 4);
    }

}
