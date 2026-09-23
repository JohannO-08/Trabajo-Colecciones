package trabajocolecciones;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorProductos gestor = new GestorProductos();
        int opcion;

        do {
            System.out.println("--- MENU ---");
            System.out.println("1. Crear producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Actualizar precio");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Precio: ");
                    double precio = Double.parseDouble(sc.nextLine());
                    gestor.agregarProducto(new Producto(id, nombre, precio));
                    break;

                case 2:
                    gestor.mostrarProductos();
                    break;

                case 3:
                    System.out.print("ID del producto a actualizar: ");
                    int idActualizar = Integer.parseInt(sc.nextLine());
                    System.out.print("Nuevo precio: ");
                    double nuevoPrecio = Double.parseDouble(sc.nextLine());
                    boolean actualizado = gestor.actualizarProducto(idActualizar, nuevoPrecio);
                    System.out.println(actualizado ? "Precio actualizado." : "Producto no encontrado.");
                    break;

                case 4:
                    System.out.print("ID del producto a eliminar: ");
                    int idEliminar = Integer.parseInt(sc.nextLine());
                    boolean eliminado = gestor.eliminarProducto(idEliminar);
                    System.out.println(eliminado ? "Producto eliminado." : "Producto no encontrado.");
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
