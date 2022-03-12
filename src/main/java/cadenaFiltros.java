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

    public double ejecutar(double revoluciones, estadoMotor estadoMotor){
        /*for (filtro f : filters) { // Por cada filtro en filters...
           filtro.ejecutar(revoluciones, estadoMotor);
        }*/
        
        
        // Aplicar primer filtro
        filtro f = filters.get(0);
        double rev = f.ejecutar(revoluciones, estadoMotor);
        // Aplicar segundo filtro
        f = filters.get(1);
        rev = f.ejecutar(rev, estadoMotor);

        // Enviárselo al salpicadero
        rev = salpicadero.ejecutar(rev, estadoMotor); // ejecutar objetivo
        
        return rev;
      } 

    public void setTarget(objetivo target){
        this.salpicadero = target;
    }
}

