package com.example.e_commerse;
/**
 * ESTA CLASE CONTIENE LOS ATRIBUTOS PARA LOS PRODUCTOS
 * ADEMÁS DE LA DEFINICIÓN DE PRODUCTOS SEGÚN EL TIPO
 * @author Bastian Vidal
 * @version 18-09-2018
 */
public class Producto {
    //DECLARACIÓN DE VARIABLES
    private String nombre;
    private String descripcion;
    private int imagenID;
    private int precio ;

    //DECLARACIÓN DE ARREGLO CONSTANTE QUE CONTIENE PRODUCTOS DEL TIPO CERVEZAS
    public final static Producto cervezas[]={
            new Producto("PAN CON AJO","Delicioso Pan Con Ajo Nutritivo",R.drawable.pan_ajo,2800),
            new Producto("PAN BIMBO", "Exquisito Pan Calido",R.drawable.pan_binbo,2200),
            new Producto("PAN LIDO","Sabros Pan",R.drawable.pan_integral_lido,3000),
            new Producto("PAN MENUDO","Delicioso Pan  Nutritivo",R.drawable.pan_menudo,2800),
            new Producto("GALLETAS ", "Exquisitas Galletas de Trigo",R.drawable.galleta_trigo_lido,2200),
            new Producto("PAN ALEMANAS","Sabros Pan Suabe",R.drawable.pan_alemanas,3000)
    };
    //DECLARACIÓN DE ARREGLO CONSTANTE QUE CONTIENE PRODUCTOS DEL TIPO PIZZAS
    public final static Producto pizzas[]={
            new Producto("Hawaiana","Contiene jamón, trozos de piña y extra queso. Tamaño Familiar",R.drawable.carnes_carnes,7500),
            new Producto("Pollo BBQ","Contiene pollo, cebollas, salsa BBQ, queso cheddar, provolone y extra queso. Tamaño Familiar",R.drawable.carnes_carnes,8000),
            new Producto("Americana","Contiene salsa de tomate extra, queso mozzarella, jamón, carne, salchicha italiana," +
                    "tocino, pepperoni y extra queso",R.drawable.carnes_carnes,8500)
    };

    /**
     * Constructor por defecto
     */
    public Producto() {
    }

    /**
     *CONSTRUCTOR CON PARÁMETROS
     */
    public Producto(String nombre, String descripcion, int imagenID, int precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagenID = imagenID;
        this.precio = precio;
    }

    //GETTERS Y SETTERS
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagenID() {
        return imagenID;
    }

    public void setImagenID(int imagenID) {
        this.imagenID = imagenID;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String toString() {
        return nombre;
    }

    public static Producto[] getCervezas() {
        return cervezas;
    }

    public static Producto[] getPizzas() {
        return pizzas;
    }
}



