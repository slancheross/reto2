package Application;

public class Hamburguesa {
    public static final String TAMANO = "Normal";
    public static final boolean CEBOLLA = false;
    public static final double PRECIO_BASE = 5000;

    private String tamano;
    private boolean cebolla;
    private String adicional = "";

    public Hamburguesa(String tamano, boolean cebolla) {
        this.tamano = tamano;
        this.cebolla = cebolla;        
    }

    public double auxTamano(String tamano){
        double total = ((tamano.equalsIgnoreCase("Doble"))? 2:0);
        total += ((tamano.equalsIgnoreCase("Normal") || tamano == "")? 1:0);
        return total;
    }

    public double auxAdicional(String adicional){
        double total = ((adicional.equalsIgnoreCase("Tocineta"))? 3000:0);
        total += ((adicional.equalsIgnoreCase("Jalapeños"))? 2000:0);
        return total;
    }

    public void agregarAdicional(String adicional){
        this.adicional = adicional;
    }

    public double calcularPrecio(){
        double precioGeneral = 0;
        precioGeneral = (PRECIO_BASE*auxTamano(this.tamano)) + auxAdicional(this.adicional);
        return precioGeneral;
    }


}
