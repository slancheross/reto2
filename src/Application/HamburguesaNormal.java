package Application;

public class HamburguesaNormal extends Hamburguesa {
    private String tipoCarne;
    private String adicional = "";
    private String tamano;

    public HamburguesaNormal(String tamano, boolean cebolla, String tipoCarne) {
        super(tamano, cebolla);
        this.tipoCarne = tipoCarne;
        this.tamano = tamano;
    }

    public double tipoCarneAux(String tipoCarne){
        double total = 0;
        total += (tipoCarne.equalsIgnoreCase("Res")?4000:0);
        total += (tipoCarne.equalsIgnoreCase("Res apanado")?6000:0);
        total += (tipoCarne.equalsIgnoreCase("Pollo apanado")?7000:0);
        return total;
    }
    
    public void agregarAdicional(String adicional){
        this.adicional = adicional;
    }

    public double calcularPrecio(){
        double precioHamburguesa = 0;
        double precio_carne = tipoCarneAux(this.tipoCarne);
        precioHamburguesa =  (PRECIO_BASE*auxTamano(this.tamano)) + auxAdicional(this.adicional) + precio_carne;
        return precioHamburguesa;
    }
}
