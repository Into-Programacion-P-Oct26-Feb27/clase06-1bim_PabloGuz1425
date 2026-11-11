/*
 * Dada una opción (1,2,3), imprimir los valores de verdad
 * para la operación de a y b. Donde 1 es para AND, 2 para OR, 3 para NOT
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese la operación que requiere generar\n"
                + "1. AND\n"
                + "2. OR\n"
                + "3. NOT");
        opcion = entrada.nextInt(); //4
        
        if (opcion > 0 && opcion <= 3) { // 3>0 && 3<=3 >> true && true >> true
            if (opcion==1) { // 3 == 1 >> false
                System.out.printf("%s\n", "Trabajar con AND");
                
            }else{ 
                
                if (opcion==2) { // 3 == 2 >> false
                    System.out.printf("%s\n", "Trabajar con OR");
                }else{ //
                    // se asume opción = 3
                    // sería con NOT
                    System.out.printf("%s\n", "Trabajar con NOT");
                }
            }
        }else{
            System.out.printf("%s\n", "Opción inválida");
        }

    }

}

/*
Para que un usuario para que pueda trabajar con AND el usuario debe ingresar
la opcion numero 1, verificando que su a la hora de ingresar 1 le quede igual al
opcion 1.
*/