package Paquete1;


import java.util.Scanner;

/**
 *
 * @author gabyl
 */
import Paquete2.Promedios;

public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opc;
        String nombreE;
        double cali1;
        double cali2;
        double cali3;
        boolean bandera = true;

        

        //constructores
        while (bandera) {
            System.out.println("Seleccione una opcion: \n"
                    + "Opcion 1 Presenta el Historial acadademico completo \n"
                    + "Opcion 2 Presenta Las calificaciones de las tres materias");
            opc = entrada.nextInt();

            if (opc == 1) {
                System.out.println("Ingrese el nomnre del estudiante: ");
                nombreE = entrada.next();
                System.out.println("Ingrese calificacion 1:");
                cali1 = entrada.nextDouble();
                System.out.println("Ingrese calificacion 2; ");
                cali2 = entrada.nextDouble();
                Promedios promedio1 = new Promedios(nombreE,cali1,cali2); 
                promedio1.calcularPromedio();
                System.out.printf("%s\n",promedio1);

            } else {

                if (opc == 2) {
                    System.out.println("Ingrese el nomnre del estudiante: ");
                    nombreE = entrada.next();
                    System.out.println("Ingrese calificacion 1:");
                    cali1 = entrada.nextDouble();
                    System.out.println("Ingrese calificacion 2; ");
                    cali2 = entrada.nextDouble();
                    System.out.println("ingrese calificacion 3; ");
                    cali3 = entrada.nextDouble();
                    Promedios promedio2 = new Promedios(nombreE,cali1,
                            cali2,cali3);
                    promedio2.calcularPromedio();
                    System.out.printf("%s\n",promedio2);
                   

                } else {
                    System.out.println("Opcion no valida");
                    bandera = false;
                }
            }
        }
        entrada.nextLine();
    }

}
