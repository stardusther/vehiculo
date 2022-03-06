public class filtroCalcularVelocidad implements filtro{

    int incrementoVelocidad = 0;

    public double ejecutar(double revoluciones, estadoMotor estadoMotor){
        double result = 0.0;

        if(estadoMotor == estadoMotor.acelerando)
            incrementoVelocidad = 100;
        else if(estadoMotor == estadoMotor.frenando)
                incrementoVelocidad = -100;
        
        return result;

    }
}
