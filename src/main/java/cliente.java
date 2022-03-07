/**
 * @author Sandra Reinoso
 * @author Esther García 
 */

public class cliente {
    gestorFiltros filterManager;

    // Definir el gestor de filtros
   public void setFilterManager(gestorFiltros filterManager){
      this.filterManager = filterManager;
   }

   // Envía la petición al gestor de filtros
   public void sendRequest(double revoluciones, estadoMotor estadoMotor){
      filterManager.filterRequest(revoluciones, estadoMotor);
   }
}
