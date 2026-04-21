package model;

public class Cliente extends Usuario {
    private String Nombre;
    private String HistorialPedidos;

    public Cliente(String nombre, String historialPedidos) {
        Nombre = nombre;
        HistorialPedidos = historialPedidos;
    }

    @Override
    public void verHistorialPedidos() {
       System.out.println("Ingresando al historial de pedidos..." + HistorialPedidos);
        super.verHistorialPedidos();
    }

    @Override
    public void verificarNombre() {
        System.out.println(Nombre + " Bienvenid@ a nuestra tienda"  );
        
    }



}
