package model;

public abstract class Usuario {
    protected String IdUsuario; 
    protected String Nombre;
    protected String Apellido;
    protected String Email;
    protected int Telefono;
    protected String Direccion;
    protected String Contrasena;
    protected String HistorialPedidos;


public  Usuario (){}

public Usuario (String IdUsuario, String Nombre, String Apellido, String Email,
int Telefono, String Direccion, String Contrasena){
 this.IdUsuario = IdUsuario;
 this.Nombre = Nombre;
 this.Apellido = Apellido;
 this.Email = Email;
 this.Telefono = Telefono;
 this.Direccion = Direccion;
 this.Contrasena = Contrasena;
}
  
public void mostrarIdUsuario(){
 System.out.println("Bienvenid@. Estás ingresando con el Id:" + IdUsuario);
}

public void verHistorialPedidos(){
System.out.println("Abriendo historial de pedidos:" + HistorialPedidos);
}

public abstract void verificarNombre();

}
