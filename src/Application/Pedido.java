package Application;
public class Pedido {
    // Atributos
    private double precioTotalHamburguesas;
    private double precioTotalHamburguesasNormal;
    private double precioTotalHamburguesasPatacon;
    private Hamburguesa listaHamburguesas[];

    //Constructores
    public Pedido() {
    }

    // Constructor sobrecargado
    public Pedido(Hamburguesa listaHamburguesas[]) {
        this.listaHamburguesas = listaHamburguesas;
    }

    public double getPrecioTotalHamburguesas() {
        return precioTotalHamburguesas;
    }

    public double getPrecioTotalHamburguesasNormal() {
        return precioTotalHamburguesasNormal;
    }

    public double getPrecioTotalHamburguesasPatacon() {
        return precioTotalHamburguesasPatacon;
    }
    
    public void calcularTotales() {
        for (int i = 0; i < listaHamburguesas.length; i++) {
            if(listaHamburguesas[i]instanceof HamburguesaNormal){
                precioTotalHamburguesasNormal += listaHamburguesas[i].calcularPrecio();
            }else if(listaHamburguesas[i]instanceof HamburguesaPatacon){
                precioTotalHamburguesasPatacon += listaHamburguesas[i].calcularPrecio();
            }else if(listaHamburguesas[i] instanceof Hamburguesa){
                precioTotalHamburguesas += listaHamburguesas[i].calcularPrecio();
            }
        }
        precioTotalHamburguesas += precioTotalHamburguesasNormal + precioTotalHamburguesasPatacon;
    }
    
    public String mostrarTotales() {
        calcularTotales();
        String cadenaTotales = "El precio total de las hamburguesas es de " + precioTotalHamburguesas
        + "\nLa suma del precio de las hamburguesas normales es de " + precioTotalHamburguesasNormal
        + "\nLa suma del precio de las hamburguesas patacón es de " + precioTotalHamburguesasPatacon;
        return cadenaTotales;
    }

}
