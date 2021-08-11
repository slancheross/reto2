package Application;
public class HamburguesaPatacon extends Hamburguesa{

    private String tipoPatacon;
    private String tamano;
    private String adicional = "";

    public HamburguesaPatacon(String tamano, boolean cebolla, String tipoPatacon){
        super(tamano, cebolla);
        this.tipoPatacon = tipoPatacon;
        this.tamano = tamano;
        
    }

    public double tipoPataconAux(String tipoPatacon){
        double total = 0;
        total += (tipoPatacon.equalsIgnoreCase("Maduro")?4000:0);
        total += (tipoPatacon.equalsIgnoreCase("Verde")?3000:0);
        return total;
    }

    public void agregarAdicional(String adicional){
        this.adicional = adicional;
    }

    public double calcularPrecio(){
        double precioHamburguesa = 0;
        double valorPatacon = tipoPataconAux(this.tipoPatacon);
        precioHamburguesa =  (PRECIO_BASE*auxTamano(this.tamano)) + auxAdicional(this.adicional) + valorPatacon;
        return precioHamburguesa;
    }

}
