public abstract class Vehiculo {

    // Atributos
    private String placa;
    private String marca;
    private String modelo;
    private int anio;
    private Double precioBase;

    // Constructor vacío
    public Vehiculo() {

    }

    // Constructor para año
    public Vehiculo(int anio) {
        this.anio = anio;
    }

    // Constructor para precio
    public Vehiculo(Double precioBase) {
        this.precioBase = precioBase;
    }

    // Getters
    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    // Setters
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    // ToString
    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", precioBase=" + precioBase +
                '}';
    }
}