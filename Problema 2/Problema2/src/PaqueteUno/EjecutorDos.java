package PaqueteUno;

import PaqueteDos.Matricula;
import java.util.Scanner;

/**
 *
 * @author gabyl
 */
public class EjecutorDos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cedula;
        String marca;
        int opc;
        String cadenaFinal;
        int an;
        boolean bandera = true;
        double valor;
        cadenaFinal = "";

        while (bandera) {
            
            System.out.println("Numero de cedula: ");
            cedula = leer.next();
            System.out.println("Marca del vehiculo: ");
            marca = leer.next();
            System.out.println("Año del fabricanre: ");
            an = leer.nextInt();
            System.out.println("Valor del vehiculo: ");
            valor = leer.nextDouble();
            
            Matricula autos = new Matricula(cedula,marca,an,valor);
            
            autos.calcularAntiguedad();
            autos.calcularValorMatricula();
            
            leer.nextLine();
            
            System.out.println("Si desea ingresar mas vendedores, escriba 1"
                    + "para salir");
            opc = leer.nextInt();
            if(opc == 1){
                bandera = false;
            }
        }
        System.out.printf("%s\n", cadenaFinal);

    }
}
