public class Boleto extends Pagar {
    private int cantidad;
    public Boleto(String nombre, int numerodecuenta, int totalPagar, int cantidad) {
        super(nombre, numerodecuenta, totalPagar);
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        if (cantidad > 0 && cantidad <= 10) {
            this.cantidad = cantidad;
        } else {
            System.out.println("La cantidad de boletos debe ser entre 1 y 10.");
        }
    }


}
