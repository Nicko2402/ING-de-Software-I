public class CamionCarga extends Vehiculo {

    private double capacidadToneladas;

    public CamionCarga(String placa, String marca, String modelo, int anio, double precioBase,
                       double capacidadToneladas) {
        super(placa, marca, modelo, anio, precioBase);
        System.out.println("Constructor CamionCarga() - pendiente de implementar validaciones");
    }

    public double getCapacidadToneladas() {
        System.out.println("Metodo getCapacidadToneladas() - pendiente de implementar");
        return 0;
    }

    public void setCapacidadToneladas(double capacidadToneladas) {
        System.out.println("Metodo setCapacidadToneladas() - pendiente de implementar validacion");
    }

    @Override
    public double calcularPrecioFinal() {
        System.out.println("Metodo calcularPrecioFinal() de CamionCarga - pendiente de implementar");
        return 0;
    }
}