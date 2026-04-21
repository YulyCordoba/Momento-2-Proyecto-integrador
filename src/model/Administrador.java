package model;

public class Administrador extends Usuario {
    private String IdUsuario; 
    private String Nombre;

   

    public Administrador(String idUsuario, String nombre) {
        IdUsuario = idUsuario;
        Nombre = nombre;
    }

    @Override
    public void mostrarIdUsuario() {
        System.out.println("Ha ingresado con el Id: " + IdUsuario);
        super.mostrarIdUsuario();
    }

    @Override
    public void verificarNombre() {
        System.out.println(Nombre + " Bienvenido al sistema de administracion" );
    }

    

}

    