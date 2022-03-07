/**
 * @author Sandra Reinoso
 * @author Esther García 
 */

public class filtroCalcularVelocidad implements filtro{

    public double ejecutar(double revoluciones, estadoMotor estadoMotor){

        if(estadoMotor == estadoMotor.ACELERANDO)
            revoluciones += incrementoVelocidad; // +100
        else if(estadoMotor == estadoMotor.FRENANDO)
            revoluciones -= incrementoVelocidad; // -100

        if(revoluciones > velocidadMAX) //Supera el Maximo
            revoluciones = velocidadMAX;
        
        return revoluciones;

    }
}

/*
Actualiza y devuelve las revoluciones añadiendo la cantidad incrementoVelocidad 
(un atributo del filtro, puede ser negativa o 0), que debe previamente haberse asignado
 teniendo en cuenta el estado del motor (acelerando, frenando, apagado, encendido).

incrementoVelocidad será −100 RPM  incrementoVelocidad será +100 RPM ???????
 */