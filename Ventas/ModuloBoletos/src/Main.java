import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-   *Binvenido*   -");
        Scanner sc= new Scanner(System.in);
        Eventos fun= new Eventos();
        System.out.println("Nuestras Funciones Disponibles:");
        fun.verFunciones();

        System.out.println("Que funcion desea?:");
        int op = sc.nextInt();
        sc.nextLine();
        ListaEventos selec = fun.getFunciones().get(op - 1);
        System.out.println("Ingrese su nombre");
        String nombreCliente = sc.nextLine();
        System.out.print("Ingrese el número de cuenta : ");
        int numeroDeCuenta = sc.nextInt();
        System.out.print("Cuantos Boletos:  ");
        double cantidad = sc.nextInt();


        while (cantidad <= 0 || cantidad > 10) {
            System.out.print("Cantidad inválida. Debe ser entre 1 y 10. Ingrese nuevamente: ");
            cantidad = sc.nextInt();
        }

        double precioTotal = cantidad * selec.getPrecio();

        Boleto boleto = new Boleto(nombreCliente, numeroDeCuenta, (double)precioTotal, cantidad);
        VentaFinal factura = new VentaFinal(boleto,selec);

        System.out.println("\n" + factura.generarFactura());
    }
}