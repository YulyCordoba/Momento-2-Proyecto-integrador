import java.util.ArrayList;
import java.util.Scanner;
import model.Administrador;
import model.Cliente;
import model.Pedido;
import model.Carrito;
import model.Categoria;


public class App {
    public static void main(String[] args) throws Exception {
    Scanner leer = new Scanner(System.in);
   
      Administrador adm = new Administrador("HHenao", "Hernan Henao");
      adm.mostrarIdUsuario();
      adm.verificarNombre();


      Cliente cl = new Cliente("Zamari Rivas", " Total de pedidos realizados: 5");
      cl.verHistorialPedidos();
      cl.verificarNombre();

      Carrito add = new Carrito();
      add.buscar();
      add.eliminar();
      add.guardar();


      Categoria tipo = new Categoria();
      tipo.buscar();
      tipo.eliminar();
      tipo.guardar();

      Pedido envio = new Pedido();
      envio.enviarPedido();

          ArrayList<String> info = new ArrayList<>();
    int opcion = -1;    

    while (opcion != 0) {
      System.out.println("\n1.Crear 2.Listar, 3.Actualizar, 0.Salir");
      opcion = leer.nextInt();
      leer.nextInt();

      if (opcion == 1) {
        info.add(leer.nextLine());
        
      }else if (opcion == 2)
        System.out.println(info);

      else if (opcion == 3) {
        int i = leer.nextInt();
        leer.nextLine();
        info.set(i, leer.nextLine());
        
        leer.close();
      }
      
    }

    }


  }

