package model;

public class Carrito implements IOperaciones{
    private int idCarrito;
    private String producto;
    private int cantidad;
    private double precioUnitario;
    
    public Carrito(int idCarrito, String producto, int cantidad, double precioUnitario) {
        this.idCarrito = idCarrito;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public Carrito() {
    }

    public int getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public void eliminar() {
        System.out.println("El articulo ha sido elimindo de su carrito");
        IOperaciones.super.eliminar();
    }

    @Override
    public void buscar() {
        System.out.println("Buscando en el carrito");
        
    }

    @Override
    public void guardar() {
        System.out.println("Su articulo quedó guardado en el carrito");
        
    }

    



}