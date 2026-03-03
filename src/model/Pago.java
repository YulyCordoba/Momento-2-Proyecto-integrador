package model;

// Atributos
public class Pago {
    private int idPago;
    private String metodo;
    private double monto;
    private String estadoPago;
    private String fecha;

// Constructores con parametros
    public Pago(int idPago, String metodo, double monto, String estadoPago, String fecha) {
        this.idPago = idPago;
        this.metodo = metodo;
        this.monto = (monto);
        this.estadoPago = estadoPago;
        this.fecha = fecha;
    }

 // Constructores sin parametros (Se ueden dejar vacios por si en el futuro se requieren)
    public Pago (){

    }

// Métodos getters and setters
    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public double getMonto() {
        return monto;
    }
    
    // Incluir en un setter validaciones. (Para verificar que se cumpla con algun parametro establecido)
    public void setMonto(double monto) {
    if (monto > 0) {
    this.monto = monto;
    } else {
    System.out.println("El monto no puede ser negativo o cero.");
        }
    }
    
    public String getEstado() {
        return estadoPago;
    }

    public void setEstado(String estado) {
        this.estadoPago = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

// Inclusión de 2 métodos con procesos temporales. (Para que la respuesta no sea inmediata, tendrá un 
// tiempo de verificacion, hay otros, sin embargo Thread.sleep() es el más sencillo que es (Para pausas)), se hace con los setters

public void procesarPago() {
        System.out.println("Procesando pago...");
        try {
            Thread.sleep(3000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.estadoPago = "Aprobado";
        System.out.println("Pago aprobado exitosamente.");
    }

    public void verificarMetodo() {
        System.out.println("Verificando método de pago");
        try {
            Thread.sleep(3000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.metodo = "Aprobado";
        System.out.println("Metodo de pago correcto");
    }

}
