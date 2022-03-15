
/**
 * @author Sandra Reinoso
 * @author Esther García 
 */

public class demo {
    public static void main(String[] args) {
        gestorFiltros filterManager = new gestorFiltros(new objetivo());
        filterManager.setFilter(new filtroRepercutirRozamiento());
        filterManager.setFilter(new filtroCalcularVelocidad());

        
        objetivo salpicadero = new objetivo();


        cliente client = new cliente();
        client.setFilterManager(filterManager);

        mandos m = new mandos(client);
        new mandos(client).setVisible(true);

        m.run();

    }
}

