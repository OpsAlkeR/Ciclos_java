
import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String continuar = "s";
        String finalizar = "n";

        double Descuento = 0.0;
        double subtotalConDescuento = 0.0;
        double iva = 0.0;
        double totalCompra = 0.0;
        double totalFinal = 0.0;

        double Mouse = 25000;
        double MouseFull = 65000;
        double Teclado = 75000;
        double TecladoRetro = 95000;
        double Monitor2k = 120000;
        double Monitor4k = 190000;
        double MousePad = 15000;
        double AirpodsV1 = 35000;
        double AirpodsV2 = 55000;
        double BocinaMiniJBL = 120000;

        int cantidadMouse = 0;
        int cantidadMouseFull = 0;
        int cantidadTeclado = 0;
        int cantidadTecladoRetro = 0;
        int cantidadMonitor2k = 0;
        int cantidadMonitor4k = 0;
        int cantidadMousePad = 0;
        int cantidadAirpodsV1 = 0;
        int cantidadAirpodsV2 = 0;
        int cantidadBocinaMiniJBL = 0;
       
        int opcionProducto;
        int cantidad;
        System.out.println("!Biemvenido a logic-is-ass! ¿Desea conocer nuestro catalogo de productos? (s/n):");
        continuar = leer.next();
        
        if (continuar.equalsIgnoreCase("s")) {
            do {
            System.out.println("!Muy bien!, aqui estan nuestros productos");

            System.out.println("1. Mouse");
            System.out.println("2. MouseFull");
            System.out.println("3. Teclado");
            System.out.println("4. TecladoRetro");
            System.out.println("5. Monitor2k");
            System.out.println("6. Monitor4k");
            System.out.println("7. MousePad");
            System.out.println("8. AirpodsV1");
            System.out.println("9. AirpodsV2");
            System.out.println("10. BocinaMiniJBL");
            System.out.println("0. Finalizar");
            System.out.println("-----------------");

            opcionProducto = leer.nextInt();
            leer.nextLine();
        
        switch (opcionProducto) {
            case 1:
                System.out.println("Elegiste Mouse ¿Cuantas unidades deseas comprar?");
                cantidad = leer.nextInt();
                cantidadMouse += cantidad;
                totalCompra += (Mouse * cantidad);
                System.out.println("!Perfecto! se ha agregado al carrito.");
                break;
            case 2:
                System.out.println("Elegiste MouseFull ¿Cuantas unidades deseas comprar?");
                cantidad = leer.nextInt();
                cantidadMouseFull += cantidad;
                totalCompra += (MouseFull * cantidad);
                System.out.println("!Perfecto! se ha agregado al carrito.");
                break;
            case 3:
                System.out.println("Elegiste Teclado ¿Cuantas unidades deseas comprar?");
                cantidad = leer.nextInt();
                cantidadTeclado += cantidad;
                totalCompra += (Teclado * cantidad);
                System.out.println("!Perfecto! se ha agregado al carrito.");
                break;
            case 4:
                System.out.println("Elegiste TecladoRetro ¿Cuantas unidades deseas comprar?");
                cantidad = leer.nextInt();
                cantidadTecladoRetro += cantidad;
                totalCompra += (TecladoRetro * cantidad);
                System.out.println("!Perfecto! se ha agregado al carrito.");
                break;
            case 5:
                System.out.println("Elegiste Monitor2k ¿Cuantas unidades deseas comprar?");
                cantidad = leer.nextInt();
                cantidadMonitor2k += cantidad;
                totalCompra += (Monitor2k * cantidad);
                System.out.println("!Perfecto! se ha agregado al carrito.");
                break;
            case 6:
                System.out.println("Elegiste Monitor4k ¿Cuantas unidades deseas comprar?");
                cantidad = leer.nextInt();
                cantidadMonitor4k += cantidad;
                totalCompra += (Monitor4k * cantidad);
                System.out.println("!Perfecto! se ha agregado al carrito.");
                break;
            case 7:
                System.out.println("Elegiste MousePad ¿Cuantas unidades deseas comprar?");
                cantidad = leer.nextInt();
                cantidadMousePad += cantidad;
                totalCompra += (MousePad * cantidad);
                System.out.println("!Perfecto! se ha agregado al carrito.");
                break;
            case 8:
                System.out.println("Elegiste Airpodsv1 ¿Cuantas unidades deseas comprar?");
                cantidad = leer.nextInt();
                cantidadAirpodsV1 += cantidad;
                totalCompra += (AirpodsV1 * cantidad);
                System.out.println("!Perfecto! se ha agregado al carrito.");
                break;
            case 9:
                System.out.println("Elegiste Airpodsv2 ¿Cuantas unidades deseas comprar?");
                cantidad = leer.nextInt();
                cantidadAirpodsV2 += cantidad;
                totalCompra += (AirpodsV2 * cantidad);
                System.out.println("!Perfecto! se ha agregado al carrito.");
                break;
            case 10:
                System.out.println("Elegiste BocinaMiniJBL ¿Cuantas unidades deseas comprar?");
                cantidad = leer.nextInt();
                cantidadBocinaMiniJBL += cantidad;
                totalCompra += (BocinaMiniJBL * cantidad);
                System.out.println("!Perfecto! se ha agregado al carrito.");
                break;
            case 0:
                System.out.println("!Perfecto! Menu finaizado");
                continuar = "n";
                break;
            default:
                System.out.println("Ops, Opcion inexistente");
                break;
            }

        } while (!continuar.equalsIgnoreCase("n"));
        } else {
        System.out.println("Esta bien, Siempre a tu servucio");
    }    
    
        if (totalCompra > 600000) {
            Descuento = totalCompra * 0.10;
            System.out.println("!Se le ha añadido un descuento del 10% por superar los $600.000 pesos!");
        } else {
            System.out.println("Por el rango de tu compra no hay descuento");
        }
        subtotalConDescuento = totalCompra - Descuento;
        iva = subtotalConDescuento * 0.19;
        totalFinal = subtotalConDescuento + iva;
        
        System.out.println("==================================");
        System.out.println("         FACTURA DE COMPRA        ");
        System.out.println("==================================");

        if (cantidadMouse > 0){
            System.out.println("- Mouse x " + cantidadMouse + " u.=$" + (Mouse * cantidadMouse));
        }
        if (cantidadMouseFull > 0){
            System.out.println("- MouseFull x " + cantidadMouseFull + " u.=$" + (MouseFull * cantidadMouseFull));
        }
        if (cantidadTeclado > 0){
            System.out.println("- Teclado x " + cantidadTeclado + " u.=$" + (Teclado * cantidadTeclado));
        }
        if (cantidadTecladoRetro > 0){
            System.out.println("- TecladoRetro x " + cantidadTecladoRetro + " u.=$" + (TecladoRetro * cantidadTecladoRetro));
        }
        if (cantidadMonitor2k > 0){
            System.out.println("- Monitor2k x " + cantidadMonitor2k + " u.=$" + (Monitor2k * cantidadMonitor2k));
        }
        if (cantidadMonitor4k > 0){
            System.out.println("- Monitor4k x " + cantidadMonitor4k + " u.=$" + (Monitor4k * cantidadMonitor4k));
        }
        if (cantidadMousePad > 0){
            System.out.println("- MousePad x " + cantidadMousePad + " u.=$" + (MousePad * cantidadMousePad));
        }
        if (cantidadAirpodsV1 > 0){
            System.out.println("- Airpodpv1 x " + cantidadAirpodsV1 + " u.=$" + (AirpodsV1 * cantidadAirpodsV1));
        }
        if (cantidadAirpodsV2 > 0){
            System.out.println("- AirpodsV2 x " + cantidadAirpodsV2 + " u.=$" + (AirpodsV2 * cantidadAirpodsV2));
        }
        if (cantidadBocinaMiniJBL > 0){
            System.out.println("- BocinaMiniJBL x " + cantidadBocinaMiniJBL + " u.=$" + (BocinaMiniJBL * cantidadBocinaMiniJBL));
        }
        System.out.println("----------------------------------");
        System.out.println("Subtotal acomulado: $" + totalCompra);
        System.out.println("Descuento aplicado (10%): -$" + Descuento);
        System.out.println("Subtotal con descuento: $" + subtotalConDescuento);
        System.out.println("IVA (19%): +$" + iva);
        System.out.println("==================================");
        System.out.println("TOTAL A PAGAR: $" + totalFinal);
        System.out.println("==================================");
        System.out.println("!Gracias por su compra vuelva pronto");
        System.out.println("Creado por el programador en proceso mas grande de mi casa osea yo w.pino");
    }
}
