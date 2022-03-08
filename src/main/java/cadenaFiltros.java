import java.util.ArrayList;
import java.util.List;

/**
 * @author Sandra Reinoso
 * @author Esther García 
 */

public class cadenaFiltros {
    private List<filtro> filters = new ArrayList<filtro>();
    private objetivo salpicadero;
    
    public void addFilter(filtro f){
        filters.add(f);
    }

    public void ejecutar(double revoluciones, estadoMotor estadoMotor){
        /*for (filtro f : filters) { // Por cada filtro en filters...
           filtro.ejecutar(revoluciones, estadoMotor); // los returns se van a la mierda?
        }*/
        
        // Aplicar primer filtro
        filtro f = filters.get(0);
        double rev = filtro.ejecutar(revoluciones, estadoMotor);
        // Aplicar segundo filtro
        f = filters.get(1);
        rev = filtro.ejecutar(rev, estadoMotor);

        // Enviárselo al salpicadero
        salpicadero.ejecutar(rev, estadoMotor); // ejecutar objetivo
     } 

    public void setTarget(objetivo target){
        this.salpicadero = target;
    }
}

