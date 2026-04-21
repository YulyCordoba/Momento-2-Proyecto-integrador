package model;

public class Entrega extends Pedido{

    @Override
    public void enviarPedido() {
     System.out.println("Su pedido fue enviado, se encuentra en proceso de entrega");
    }


}