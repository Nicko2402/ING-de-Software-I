import java.util.ArrayList;

public class main {
        // Agregar vehículo al ArrayList
        static void agregarVehiculo(ArrayList<Vehiculo> inventario, Vehiculo v) {
            inventario.add(v);
        }

        // Listar vehículos
        static void listarInventario(ArrayList<Vehiculo> inventario) {

            if (inventario.isEmpty()) {
                System.out.println("El inventario está vacío.");
                return;
            }

            for (Vehiculo v : inventario) {
                System.out.println(v);
            }
        }

        public static void main(String[] args) {

            // Crear el ArrayList
            ArrayList<Vehiculo> inventario = new ArrayList<>();


            listarInventario(inventario);
        }
    }

