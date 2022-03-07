/**
 * @author Sandra Reinoso
 * @author Esther García 
 */

public class gestorFiltros {
    cadenaFiltros filterChain;

   // constructor 
   public gestorFiltros(objetivo target){
      filterChain = new cadenaFiltros();
      filterChain.setTarget(target);
   }

   // Añadir un filtro a la cadena de filtros
   public void setFilter(filtro filter){
      filterChain.addFilter(filter);
   }

   // Ejecutar los filtros de la cadena de filtros
   public void filterRequest(double revoluciones, estadoMotor estadoMotor){
      filterChain.ejecutar(revoluciones, estadoMotor);
   }
}
