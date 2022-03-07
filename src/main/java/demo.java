
/**
 * @author Sandra Reinoso
 * @author Esther García 
 */

public class demo {
    public static void main(String[] args) {
        gestorFiltros filterManager = new gestorFiltros(new objetivo());
        filterManager.setFilter(new filtroCalcularVelocidad());
        filterManager.setFilter(new filtroRepercutirRozamiento());
  
        cliente client = new cliente();
        client.setFilterManager(filterManager); 
        //client.sendRequest("HOME"); FALTA
     }
}

