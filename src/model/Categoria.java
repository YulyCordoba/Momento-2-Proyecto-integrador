package model;

public class Categoria implements IOperaciones{  
    private int idCategoria;
    private String nombre;
    private String descripcion; 

    public Categoria (){
    }

    public Categoria(int idCategoria, String nombre, String descrpcion) {
            this.idCategoria = idCategoria;
            this.nombre = nombre;
            this.descripcion = descrpcion;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public void buscar() {
        System.out.println("Buscando la categoria");
        
    }

    @Override
    public void eliminar() {
      System.out.println("La categoria fue eliminada correctamente");
        IOperaciones.super.eliminar();
    }

    @Override
    public void guardar() {
       System.out.println("Ha quedado guardada la nueva categoria");
        
    }

}
