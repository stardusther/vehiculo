
/**
 * @author Sandra Reinoso
 * @author Esther García 
 */

public class demo {
    public static void main(String[] args) {
        gestorFiltros filterManager = new gestorFiltros(new objetivo());
        filterManager.setFilter(new filtroRepercutirRozamiento());
        filterManager.setFilter(new filtroCalcularVelocidad());
        
  
        cliente client = new cliente();
        client.setFilterManager(filterManager); 
        
        // Programa (creo) no podemos probarlo porque no tenemos el ejecutar de objetivo
        client.sendRequest(0, estadoMotor.APAGADO);
        client.sendRequest(0, estadoMotor.ENCENDIDO);
        client.sendRequest(2000, estadoMotor.ACELERANDO);
        client.sendRequest(2300, estadoMotor.ACELERANDO);
        client.sendRequest(2400, estadoMotor.ACELERANDO);
        client.sendRequest(2500, estadoMotor.ACELERANDO);
        client.sendRequest(2300, estadoMotor.FRENANDO);
        client.sendRequest(2100, estadoMotor.FRENANDO);
        client.sendRequest(1500, estadoMotor.FRENANDO);
        client.sendRequest(1000, estadoMotor.FRENANDO);
        client.sendRequest(500, estadoMotor.FRENANDO);
        client.sendRequest(0, estadoMotor.APAGADO);
        
     }
}

