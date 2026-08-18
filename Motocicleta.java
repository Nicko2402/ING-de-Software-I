public class Motocicleta extends Vehiculo {

    private int cilindraje;

    public Motocicleta(String placa, String marca, String modelo, int anio, double precioBase,
                       int cilindraje) {
        super(placa, marca, modelo, anio, precioBase);
        System.out.println("Constructor Motocicleta() - pendiente de implementar validaciones");
    }

    public int getCilindraje() {
        System.out.println("Metodo getCilindraje() - pendiente de implementar");
        return 0;
    }

    public void setCilindraje(int cilindraje) {
        System.out.println("Metodo setCilindraje() - pendiente de implementar validacion");
    }

    @Override
    public double calcularPrecioFinal() {
        System.out.println("Metodo calcularPrecioFinal() de Motocicleta - pendiente de implementar");
        return 0;
    }
}