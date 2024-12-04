import java.util.Calendar;
import java.util.GregorianCalendar;

public class VentaFinal {
    private Boleto boleto;
    private ListaEventos evento;
    private String fecha;

    public VentaFinal(Boleto boleto, ListaEventos evento) {
        this.boleto = boleto;
        this.evento = evento;
        Calendar calendar = new GregorianCalendar();
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        int mes = calendar.get(Calendar.MONTH) + 1;
        int anio = calendar.get(Calendar.YEAR);
        this.fecha = dia + "/" + mes + "/" + anio;
    }

    public Boleto getBoleto() {
        return boleto;
    }

    public ListaEventos getEvento() {
        return evento;
    }

    public String getFechaEmision() {
        return fecha;
    }

    public String generarFactura() {
        return "Factura:\n" +
                "-----------------------------------------------------\n"+
                "Evento: " + evento.toString()
                + "\n" + "Cliente: " + boleto.getNombre() + "\n" + "Numero de cuenta: "
                + boleto.getNumerodecuenta() + "\n" + "Cantidad de boletos: " + boleto.getCantidad()
                + "\n" +
                "-----------------------------------------------------\n"
                + "Total a pagar: $" + boleto.getTotalPagar() + "\n" +
                "Fecha de emisión: " + fecha;
    }
}
