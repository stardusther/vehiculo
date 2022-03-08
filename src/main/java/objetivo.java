/**
 * @author Sandra Reinoso
 * @author Esther García 
 */

public class objetivo {
    // Atributos
    double vangular = 0, vlineal = 0;
    double distancia_recorrida = 0;

    // Métodos
    public double convertir(double vel){ // convierte la velocidad angular en lineal
        double vlineal;
        vlineal = 2 * Math.PI * 0.15 * vel * (60/1000); // Km/h
        return vlineal;
    }

    // Por qué devuelve un double ??? lo pone porque la cabecera del método está ya hecha
    double ejecutar(double revoluciones, estadoMotor estadoMotor){ // revoluciones calculadas (ya han pasado por los filtros)

        System.out.println(" --- Ejecutando petición ---");
        vangular = revoluciones;
        vlineal = convertir(revoluciones);
        distancia_recorrida += 10; // ?? he puesto que sean 10 km cada vez pero es para salir del paso D = v * t
        return revoluciones; 
    }

}
