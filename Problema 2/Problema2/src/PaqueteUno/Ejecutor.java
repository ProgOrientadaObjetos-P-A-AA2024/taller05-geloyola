package PaqueteUno;
import PaqueteDos.Matricula;
import java.util.Scanner;

/**
 *
 * @author gabyl
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i = 0;
        int an;
        int vehiculos;
        String cadenaFinal;
        String cedula;
        String marca;
        double valor;

        cadenaFinal = "";
        System.out.println("Vehiculos a evaluar");
        vehiculos = leer.nextInt();
        while (i < vehiculos) {
            leer.nextLine();
            System.out.println("\n Numero de cedula: ");
            cedula = leer.next();
            System.out.println("Marca del vehiculo: ");
            marca = leer.next();
            System.out.println("Año de fabricacion: ");
            an = leer.nextInt();
            System.out.println("Valor del vehiculo: ");
            valor = leer.nextDouble();
            
            Matricula autos = new Matricula(cedula, marca, an,valor);
            
            autos.calcularAntiguedad();
            autos.calcularValorMatricula();
            
            cadenaFinal =String.format("Valor de la Matricula \n\n"
                    + "Cedula: %s\n"
                    + "Marca del vehiculo: %s\n"
                    + "Año de fabricacion: %s\n"
                    + "Valor del vehiculo: %s\n"
                    + "Äntiguedad: %s\n"
                    + "Valor de la matricula: %s\n"
                    ,autos.obtenerCedula(),
                    autos.obtenerMarcaV(),autos.obtenerAnFabricacion(),
                    autos.obtenerValorVehiculo(),autos.obtenerAntiguedad(),
                    autos.obtenerValorMatricula());
            i++;
        }
        System.out.printf("%s\n",cadenaFinal);

    }

}
