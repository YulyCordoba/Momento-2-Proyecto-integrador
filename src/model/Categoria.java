package model;

// Atributos

public class Categoria {  
    private int idCategoria;
    private String nombre;
    private String descripcion;
   

// Constructores con parametros
 public Categoria(int idCategoria, String nombre, String descrpcion) {
        this.idCategoria = idCategoria;
        this.nombre = (nombre);
        this.descripcion = descrpcion;
    }

// Constructores sin parametros (Se ueden dejar vacios por si en el futuro se requieren)
public Categoria (){
}

// Métodos getters and setter
public int getIdCategoria() {
    return idCategoria;
}

public void setIdCategoria(int idCategoria) {
    this.idCategoria = idCategoria;
}

public String getNombre() {
    return nombre;
}

// Incluir en un setter validaciones. (Para verificar que se cumpla con algun parametro establecido) 
public void setNombre(String nombre) {
    if (nombre != null && !nombre.trim().isEmpty()) {
        this.nombre = nombre.trim();
    } else {
        System.out.println("El nombre no puede ir vacio.");
        }
    }

public String getDescrpcion() {
    return descripcion;
}

public void setDescrpcion(String descrpcion) {
    this.descripcion = descrpcion;
}

//Inclusión de 2 métodos con procesos temporales. (Para que la respuesta no sea inmediata, tendrá un 
// tiempo de verificacion, hay otros, sin embargo Thread.sleep() es el más sencillo que es (Para pausas)), se hace con los setters

public String mostrarNombreConEspera() {
    try {
        System.out.println("Procesando nombre...");
        Thread.sleep(3000); 
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    return nombre;
}
public boolean validarCategoriaConEspera() {
    try {
        System.out.println("Validando categoria...");
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    return idCategoria > 0 
        && nombre != null && !nombre.trim().isEmpty();
}
}
