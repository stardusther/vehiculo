/**
 * @author Sandra Reinoso
 * @author Esther García 
 */

public interface filtro {
    double incrementoVelocidad = 100; // RPM
    double velocidadMAX = 5000.0; // RPM

    public static double ejecutar(double revoluciones, estadoMotor estadoMotor) {
        return 0;
    }

}

/*
Actualiza y devuelve las revoluciones añadiendo la cantidad incrementoVelocidad 
(un atributo del filtro, puede ser negativa o 0), que debe previamente haberse asignado
 teniendo en cuenta el estado del motor (acelerando, frenando, apagado, encendido).

incrementoVelocidad será −100 RPM  incrementoVelocidad será +100 RPM ???????
 */