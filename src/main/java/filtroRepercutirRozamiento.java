/**
 * @author Sandra Reinoso
 * @author Esther García 
 */

public class filtroRepercutirRozamiento implements filtro{
    public double ejecutar(double revoluciones, estadoMotor estadoMotor){
        double disminucion = -1;

        return revoluciones - disminucion; // Se quita un valor constante
    }
}
