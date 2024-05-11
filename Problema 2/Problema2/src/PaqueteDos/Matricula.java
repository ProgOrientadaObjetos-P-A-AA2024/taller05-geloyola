
package PaqueteDos;

/**
 *
 * @author gabyl
 */
public class Matricula {
    private String cedula;
    private String marcaV;
    private int anFabricacion;
    private double valorVehiculo;
    private double valorMatricula;
    private int anAntiguedad;
    
    public Matricula(String c, String mv, int af, double v){
        cedula =c;
        marcaV = mv;
        anFabricacion = af;
        valorVehiculo = v;
    }
    public Matricula(String c, String mv, int af){
        cedula =c;
        marcaV = mv;
        anFabricacion = af;
        valorVehiculo = 60000.89;
    }
    public void establecerCedula(String a){
        cedula = a;
    }
    public void establecerMarcaV(String a){
        marcaV = a;
    }
    public void establecerAnFabicacion(int a){
        anFabricacion = a;
    }
    public void establecerValorVehiculo(double a){
        valorVehiculo = a;
    }
    public void calcularAntiguedad(){
        anAntiguedad = (2024 - anFabricacion);
    }
    public void calcularValorMatricula(){
        valorMatricula = (0.00002*valorVehiculo)*anAntiguedad;
    }
    public String obtenerCedula(){
        return cedula;
    }
    public String obtenerMarcaV(){
        return marcaV;
    }
    public int obtenerAnFabricacion(){
        return anFabricacion;
    }
    public double obtenerValorVehiculo(){
        return valorVehiculo;
    }
    public double obtenerAntiguedad(){
        return anAntiguedad;
    }
    public double obtenerValorMatricula(){
        return valorMatricula;
    }
    @Override
    public String toString(){
        String cadena = String.format("Valor de la matricula\n\n"
                + "Cedula: %s\n"
                + "Marca del vehiculo: %s\n"
                + "Año de fabricacion: %d\n"
                + "valor del vehiculo: %.2f\n"
                + "Años de antiguedad: %d\n"
                + "Valor de la matricula: %.2f\n", obtenerCedula(),
                obtenerMarcaV(), obtenerAnFabricacion(),
                obtenerValorVehiculo(), obtenerAntiguedad(),
                obtenerValorMatricula());
        return cadena;
    }
    
}
