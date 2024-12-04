public class Boleto extends Pagar {
    private double cantidad;
    public Boleto(String nombre, int numerodecuenta, double totalPagar, double cantidad) {
        super(nombre, numerodecuenta, totalPagar);
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        if (cantidad > 0 && cantidad <= 10) {
            this.cantidad = cantidad;
        } else {
            System.out.println("La cantidad de boletos debe ser entre 1 y 10.");
        }
    }


}
