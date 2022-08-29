
package corto12s_2022;

import java.util.Scanner;

/**
 *
 * @author ROGA11
 */
public class Corto12s_2022 {

    
    public static void main(String[] args) {
        int opcion;
        boolean salir = false;
        Scanner teclado = new Scanner(System.in);

        while (!salir) {
            System.out.println("========Menú========");
            System.out.println("1.Operaciones del Cuadrado");
            System.out.println("2.Operaciones del Circulo");
            System.out.println("3.Salir");

            System.out.println("ELIJA LA OPERACION A EFECTUAR");

            try {
                opcion = teclado.nextInt();
                switch (opcion) {
                    case 1:
                        int lado;
                        int ladoc;
                        System.out.println("Operaciones del cuadrado");
                        System.out.print("Ingres el Lado del Cuadrado: ");
                        lado=teclado.nextInt();
                        System.out.println("");
                        System.out.print("Ingrese el lado del cubo: ");
                        ladoc=teclado.nextInt();
                        System.out.println("");
                        System.out.println("Area del Cuadrado: "+Operaciones.AreaCuadrado(lado));
                        System.out.println("Volumen del Cubo: "+Operaciones.VolCubo(ladoc));
                        break;
                    case 2:
                       int radio;
                       int radioe;
                        System.out.println("Operaciones del cuadrado");
                        System.out.print("Ingres el radio del Circulo: ");
                        radio=teclado.nextInt();
                        System.out.println("");
                        System.out.print("Ingrese el radio de la Esfera: ");
                        radioe=teclado.nextInt();
                        System.out.println("");
                        System.out.println("Area del Circulo: "+Operaciones.AreaCirculo(radio));
                        System.out.println("Area de la Esfera: "+Operaciones.VolEsfera(radioe));
                        break;
                    case 3:
                        salir = true;
                        System.out.println("FIN DEL PROGRAMA");

                        break;
                    default:
                        System.out.println("Elija Una Opcion del Menu");

                }
            } catch (Exception e) {

                System.out.println("ELIJA UNA OPCION VALIDA");
                teclado.next();
            }
        }
       
    }
    
}
