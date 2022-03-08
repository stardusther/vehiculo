
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
        client.sendRequest(20, estadoMotor.ACELERANDO);
        client.sendRequest(200, estadoMotor.FRENANDO);
        client.sendRequest(0, estadoMotor.APAGADO);
        
     }
}

