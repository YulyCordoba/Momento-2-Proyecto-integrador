import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Carrito;
import model.Categoria;
import model.Entrega;
import model.Pago;
import model.Pedido;
import model.Producto;
import model.Tienda;
import model.Usuario;


public class App {
    public static void main(String[] args) throws Exception {
         
        Scanner leer = new Scanner(System.in);
         Tienda miTienda = new Tienda();
// usuario

System.out.println("Ingrese el ID del usuario:");
int idUsuario = leer.nextInt();
leer.nextLine();

System.out.println("Ingrese el nombre:");
String nombreUsuario = leer.nextLine();

System.out.println("Ingrese el apellido:");
String apellidoUsuario = leer.nextLine();

System.out.println("Ingrese el email:");
String emailUsuario = leer.nextLine();

System.out.println("Ingrese el telefono:");
int telefonoUsuario = leer.nextInt();
leer.nextLine();

System.out.println("Ingrese la direccion:");
String direccionUsuario = leer.nextLine();

System.out.println("Ingrese la contraseña:");
String contrasenaUsuario = leer.nextLine();

Usuario usuario = new Usuario(
        idUsuario,
        nombreUsuario,
        apellidoUsuario,
        emailUsuario,
        telefonoUsuario,
        direccionUsuario,
        contrasenaUsuario
);

miTienda.registrarUsuario(usuario);
// productos

System.out.println("\nIngrese el ID del producto:");
int idProductoTienda = leer.nextInt();
leer.nextLine();

System.out.println("Ingrese el nombre del producto:");
String nombreProductoTienda = leer.nextLine();

System.out.println("Ingrese la descripcion:");
String descripcionProductoTienda = leer.nextLine();

System.out.println("Ingrese el precio:");
double precioProductoTienda = leer.nextDouble();

System.out.println("Ingrese la categoria:");
leer.nextLine();
String categoriaProductoTienda = leer.nextLine();

System.out.println("Ingrese el stock:");
int stockProductoTienda = leer.nextInt();

Producto productoTienda = new Producto(
        idProductoTienda,nombreProductoTienda,descripcionProductoTienda,precioProductoTienda,
        categoriaProductoTienda, stockProductoTienda
);

miTienda.agregarProducto(productoTienda);

// Mostrar lo que se guardó
miTienda.listarUsuarios();
miTienda.mostrarProductos();
//=====================================================================================================================
//INICIO DE LA SECCIÓN DE COMPRA
//=====================================================================================================================
   // sección categoria       
      System.out.println("Favor indicar el id de la categoria");
        int idCategoria = leer.nextInt();
         leer.nextLine();
        System.out.println("Escribe el nombre del producto");
        String nombre = leer.nextLine();
        System.out.println("Brinda la descripcion");
        String descripcion = leer.nextLine();

      Categoria categoria = new Categoria(idCategoria, nombre, descripcion );

   // sección carrito
    
        System.out.println("Ingrese el id del carrito");
        int idCarrito = leer.nextInt();
        leer.nextLine();

        System.out.println("Ingrese el nombre del producto");
        String producto = leer.nextLine();

        System.out.println("Ingrese la cantidad");
        int cantidad = leer.nextInt();

        System.out.println("Ingrese el precio unitario");
        double precio = leer.nextDouble();

        Carrito carrito = new Carrito(idCarrito, producto, cantidad, precio);

        carrito.calcularTotalConEspera();


      System.out.println("\nPasando a la sección de envío...");
        Thread.sleep(2000);

         System.out.println("Ingrese el id de la entrega");
         int idEntrega = leer.nextInt();
         leer.nextLine();
         System.out.println("Favor ingresar la direccion");
         String direccion = leer.nextLine();
         System.out.println("Diligencie el tipo de entrega");
         String tipoEntrega = leer.nextLine();
         System.out.println("Escribir el estado");
         String estado = leer.nextLine();
         System.out.println("Agregar el costo de envio");
         double costo = leer.nextDouble();   
         System.out.println("Ingrese el id de la entrega");
         leer.nextLine();

        Entrega entrega = new Entrega(idEntrega, direccion, tipoEntrega, estado, costo);

      System.out.println("Pasando a la sección de pago...");
      Thread.sleep(3000); 
         
         System.out.println("Ingrese el método de pago");
         String metodo = leer.nextLine();
         leer.nextLine();
         System.out.println("Ingresar el estado del pago");
         String estadoPago = leer.nextLine();
         System.out.println("Fecha de pago");
         String fecha = leer.nextLine();
         System.out.println("Ingrese el valor a pagar del producto"); 
         double monto = leer.nextDouble();
         System.out.println("Ingrese el id del pago");
        int idPago = leer.nextInt();
        leer.nextLine();

        Pago pago = new Pago(idPago, metodo, monto, estadoPago, fecha);

           // sección pedido
       
        System.out.println("\nPasando a la sección de pedido...");
        Thread.sleep(2000);

        System.out.println("Ingrese el id del pedido");
        int idPedido = leer.nextInt();
        leer.nextLine();

        Pedido pedido = new Pedido(idPedido, entrega.getDireccion(), entrega.getEstado());

        pedido.confirmarPedido();
      

        List<Integer> listaResultados = new ArrayList<>();
        listaResultados.add(categoria.getIdCategoria());
        listaResultados.add(entrega.getIdEntrega());
        listaResultados.add(pago.getIdPago());
        listaResultados.add(pedido.getIdPedido());

        System.out.println("Mostrando el resumen de la compra.." );
        Thread.sleep(3000);

      System.out.println("\n===== RESUMEN FINAL =====");
      System.out.println("Producto: " + producto);
      System.out.println("Cantidad: " + cantidad);
      System.out.println("Total pagado: " + (monto+costo));
      System.out.println("Dirección de envio: " + direccion);
      System.out.println("estado: " + entrega.getEstado());
      System.out.println("Categoria: " + categoria.getIdCategoria());
      System.out.println("Id pago: " + pago.getIdPago());
      System.out.println("Id pedido: " + pedido.getIdPedido());
      System.out.println("¡Gracias por su compra!");
      

          leer.close();        
          
    }}

