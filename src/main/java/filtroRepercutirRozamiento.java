/**
 * @author Sandra Reinoso
 * @author Esther García 
 */

public class filtroRepercutirRozamiento implements filtro{
    public double ejecutar(double revoluciones, estadoMotor estadoMotor){
        double disminucion = 1, vel;
        
        vel = revoluciones - disminucion;  // Se quita un valor constante
        
        if(vel < 0) // Para evitar rozamiento cuando está parado
            vel = 0;

        return vel;
    }
}
