import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter; 
/**
 * @author Sandra Reinoso
 * @author Esther García 
 */

public class objetivo {
    // Atributos
    double vangular, vlineal;
    double distancia_recorrida;
    
    double tiempo_ant, tiempo;

    // Métodos
    double convertir(double rev){ // convierte la velocidad angular en lineal
        double v = 2 * Math.PI * 0.15 * rev * 0.06;
       
        return v;
    }

    // Por qué devuelve un double ??? lo pone porque la cabecera del método está ya hecha
    double ejecutar(double revoluciones, estadoMotor estadoMotor){ // revoluciones calculadas (ya han pasado por los filtros)
        tiempo = (java.time.LocalTime.now().toSecondOfDay() - tiempo_ant) / 3600; // conversión de segundos a horas
        System.out.println(" --- Ejecutando petición ---");
        System.out.println(" ESTADO MOTOR: " + estadoMotor.toString());
        
        // (para que me de la distancia recorrida en el anterior)
        distancia_recorrida += vlineal * tiempo; // D = v * t (km)
        vangular = revoluciones;
        vlineal = convertir(revoluciones); // km/h
        
        tiempo_ant = java.time.LocalTime.now().toSecondOfDay();
        
        System.out.println(" Velocidad: " + String.format("%.2f", vlineal) + " km/h"); // Sólo dos decimales
        System.out.println(" Revoluciones: " + vangular + " rpm");
        System.out.println(" Distancia: " + distancia_recorrida + " km");
        return revoluciones; 
    }

}
