package model;

public class Carrito {
 // Atributos
    private int idCarrito;
    private String producto;
    private int cantidad;
    private double precioUnitario;

    // Constructor con parámetros
    public Carrito(int idCarrito, String producto, int cantidad, double precioUnitario) {
        this.idCarrito = idCarrito;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    // Constructor vacío
    public Carrito() {
    }

    // Getters y Setters
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
        if (producto != null && !producto.trim().isEmpty()) {
            this.producto = producto.trim();
        } else {
            System.out.println("El producto no puede estar vacío.");
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("La cantidad debe ser mayor que 0.");
        }
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario > 0) {
            this.precioUnitario = precioUnitario;
        } else {
            System.out.println("El precio debe ser mayor que 0.");
        }
    }

    // Método con proceso temporal
    public double calcularTotalConEspera() {
        System.out.println("Calculando total del carrito...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double total = cantidad * precioUnitario;
        System.out.println("Total del carrito: $" + total);
        return total;
    }
}


