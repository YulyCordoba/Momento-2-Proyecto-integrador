package model;

public class Pedido {
// Atributos
    private int idPedido;
    private String direccionEnvio;
    private String estado;

    // Constructor con parámetros
    public Pedido(int idPedido, String direccionEnvio, String estado) {
        this.idPedido = idPedido;
        this.direccionEnvio = direccionEnvio;
        this.estado = estado;
    }

    // Constructor vacío
    public Pedido() {
    }

    // Getters y Setters
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        if (direccionEnvio != null && !direccionEnvio.trim().isEmpty()) {
            this.direccionEnvio = direccionEnvio.trim();
        } else {
            System.out.println("La dirección es obligatoria.");
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Métodos con espera
    public void confirmarPedido() {
        System.out.println("Confirmando pedido...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.estado = "Confirmado";
        System.out.println("Pedido confirmado exitosamente.");
    }

    public void verificarEstado() {
        System.out.println("Verificando estado del pedido...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Estado actual: " + estado);
    }
}


