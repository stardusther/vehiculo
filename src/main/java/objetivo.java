/**
 * @author Sandra Reinoso
 * @author Esther García 
 */

public class objetivo {
    // Atributos
    double vangular = 0;
    double distancia_recorrida = 0;
    salpicadero salpicadero = new salpicadero();

    // Métodos
    public double convertir(double vel){ // convierte la velocidad angular en lineal
        double vlineal;
        vlineal = 2 * Math.PI * 0.15 * vel * (60/1000); // Km/h
        return vlineal;
    }

    double ejecutar(double revoluciones, estadoMotor estadoMotor){ // revoluciones calculadas (ya han pasado por los filtros)
        
        salpicadero.vel_km = convertir(revoluciones);
        return revoluciones; 
    }

}
