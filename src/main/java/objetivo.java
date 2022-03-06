public class objetivo {
    // Atributos
    double vangular = 0, vlineal = 0;
    double distancia_recorrida = 0;
    // Math.PI

    // Métodos
    public void convertir(double vel){ // convierte la velocidad angular en lineal
        vlineal=2*Math.PI*0.15*vel*(60/1000);
    }

    public void execute(){
        
    }

}
