package model;

// Atributos
public class Entrega {
    private int idEntrega;
    private String direccion;
    private String tipoEntrega;
    private String estado;
    private double costo;

// Constructores con parametros
public Entrega(int idEntrega, String direccion, String tipoEntrega, String estado, double costo) {
this.idEntrega =idEntrega;
this.direccion = (direccion);
this.tipoEntrega = tipoEntrega;
this.estado = estado;
this.costo = costo;

}
// Constructores sin parametros (Se ueden dejar vacios por si en el futuro se requieren)

public Entrega() {
}

// Métodos getters and setter
public int getIdEntrega() {
    return idEntrega;
}

public void setIdEntrega (int idEntrega){
    this.idEntrega = idEntrega;
}

public String getDireccion() {
    return direccion;
}
// Incluir en un setter validaciones. (Para verificar que se cumpla con algun parametro establecido) 
public void setDireccion(String direccion) {
    if (direccion != null && !direccion.trim().isEmpty()) {
        this.direccion = direccion.trim();
    } else {
        System.out.println("La dirección es obligatoria.");
        }
    }

public String gettipoEntrega () {
    return tipoEntrega;
}

public void setTipoEntrega (String tipoEntrega){
    this.tipoEntrega = tipoEntrega;
}

public String getEstado () {
    return estado;
}

public void setEstado (String estado){
    this.estado = estado;
}

public double getCosto () {
    return costo;
}

public void setcosto (double costo){
    this.costo = costo;
}
// Inclusión de 2 métodos con procesos temporales. (Para que la respuesta no sea inmediata, tendrá un 
// tiempo de verificacion, hay otros, sin embargo Thread.sleep() es el más sencillo que es (Para pausas)), se hace con los setters

public void consultaEstado() {
        System.out.println("Consultando estado..");
        try {
            Thread.sleep(3000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.estado = "El estado es..";
    }

    public void añadirDireccion() {
        System.out.println("Ingresando direccion asignada");
        try {
            Thread.sleep(3000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.direccion = "Listo!";
    }

}