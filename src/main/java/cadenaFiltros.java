import java.util.ArrayList;
import java.util.List;

public class cadenaFiltros {
    private List<filtro> filtros = new ArrayList<filtro>();
    private objetivo salpicadero;

    public void addFilter(filtro f){
        filtros.add(f);
    }
    
}
