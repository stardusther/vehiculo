
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
        
        new mandos_form(client).setVisible(true);
        
        client.sendRequest(0, estadoMotor.APAGADO);

     }
}

