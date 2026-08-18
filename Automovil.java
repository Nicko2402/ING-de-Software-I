public class Automovil extends Vehiculo {

    private int numeroPuertas;
    private String tipoCombustible;

    public Automovil(String placa, String marca, String modelo, int anio, double precioBase,
                     int numeroPuertas, String tipoCombustible) {
        super(placa, marca, modelo, anio, precioBase);
        System.out.println("Constructor Automovil() - pendiente de implementar validaciones");
    }

    public int getNumeroPuertas() {
        System.out.println("Metodo getNumeroPuertas() - pendiente de implementar");
        return 0;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        System.out.println("Metodo setNumeroPuertas() - pendiente de implementar validacion");
    }

    public String getTipoCombustible() {
        System.out.println("Metodo getTipoCombustible() - pendiente de implementar");
        return null;
    }

    public void setTipoCombustible(String tipoCombustible) {
        System.out.println("Metodo setTipoCombustible() - pendiente de implementar validacion");
    }

    @Override
    public double calcularPrecioFinal() {
        System.out.println("Metodo calcularPrecioFinal() de Automovil - pendiente de implementar");
        return 0;
    }
}