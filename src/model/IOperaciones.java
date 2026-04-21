package model;

public interface IOperaciones {
    void guardar();
    void buscar();
    default void eliminar(){
        System.out.println("Se ha eliminado correctamente");
    }

}
