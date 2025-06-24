import java.util.ArrayList;
import java.util.Scanner;

public class GeneradorFacturas {
    public static void main(String[] args) {
        
        ArrayList<String> productos = new ArrayList<>();
        
        ArrayList<Integer> precioProductos = new ArrayList<>();
        
        var subTotal = 0;
        
        final var ValorIva = 0.10;
        
        var consola = new Scanner(System.in);
        
        // Datos del cliente
        
        System.out.print("Ingresa el nombre del cliente: ");
        var clienteNombre = consola.nextLine().strip();
        
        System.out.print("Ingresa el numero de RUC: ");
        var numeroRuc = consola.nextLine();
        
        // Detalles de la compra
        
        System.out.println("Ingrese la cantidad de productos comprados: ");
        var cantidadProductos = consola.nextInt();
        consola.nextLine();
        
        for (int i = 0; i<cantidadProductos; i++){
            System.out.println("Ingrese el producto");
            var producto = consola.nextLine().strip();
            productos.add(producto);
            System.out.println("Ingrese el precio");
            var precioProducto = Integer.parseInt(consola.nextLine());
            subTotal += precioProducto;
            precioProductos.add(precioProducto);
        }
        
        
        // Impresión de la factura
        System.out.printf("""
                          =============================
                                 FACTURA DE VENTA
                          =============================
                          Factura para: %s
                          RUC: %s
                          
                          
                          Productos
                          """, clienteNombre, numeroRuc);
        for (int i = 0; i < productos.size(); i++){
            System.out.printf("- %s --------- Gs %d%n", productos.get(i), precioProductos.get(i) );
        }
        
        var iva = subTotal * ValorIva;
        var totalPagar = subTotal + iva;
        
        System.out.printf("""
                          %nSubtotal:        Gs. %d
                          IVA (10%%):       Gs. %.0f
                          Total a pagar:    Gs. %.0f
                          """, subTotal, iva, totalPagar);

        
        

    }
}
