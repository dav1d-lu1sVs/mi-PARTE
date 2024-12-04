public class Pagar {
    private String nombre;
    private int numerodecuenta;
    private double totalPagar;

    public Pagar(String nombre, int numerodecuenta, double totalPagar) {
        this.nombre = nombre;
        this.numerodecuenta = numerodecuenta;
        this.totalPagar = totalPagar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumerodecuenta() {
        return numerodecuenta;
    }

    public void setNumerodecuenta(int numerodecuenta) {
        this.numerodecuenta = numerodecuenta;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }
    public String retornarDatos(){
        return "Cliente: "+nombre+"\n Numero de Cuenta: "+numerodecuenta+"\n Total Pagado: "+totalPagar;
    }
}
