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
        for (filtro f : filters) { // Por cada filtro en filters...
           filtro.ejecutar(revoluciones, estadoMotor);
        }
        salpicadero.ejecutar(revoluciones, estadoMotor);
     }

    public void setTarget(objetivo target){
        this.salpicadero = target;
    }
}

