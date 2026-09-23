
package trabajocolecciones;
import java.util.ArrayList;

public class GestorProductos {
    private ArrayList<Producto> productos;

    public GestorProductos() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        for (Producto p : productos) {
            if (p.getId() == producto.getId()) {
                System.out.println("Ya existe un producto con ese ID.");
                return;
            }
        }
        productos.add(producto);
        System.out.println("Producto agregado correctamente.");
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
            return;
        }
        for (Producto p : productos) {
            System.out.println(p);
        }
    }

    public boolean actualizarProducto(int id, double nuevoPrecio) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                p.setPrecio(nuevoPrecio);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarProducto(int id) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                productos.remove(p);
                return true;
            }
        }
        return false;
    }
}



