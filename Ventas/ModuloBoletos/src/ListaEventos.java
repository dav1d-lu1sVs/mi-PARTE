public enum ListaEventos {
    ACCION("Gladiador II", 7.5, "2024-12-15"),
    ROMANCE("El Timepo que vivimos", 7.5, "2024-12-20"),
    COMEDIA("Codigo Rojo", 3.75, "2024-12-25");

    private final String nombre;
    private final double precio;
    private final String fecha;

    // Constructor del enum
    ListaEventos(String nombre, double precio, String fecha) {
        this.nombre = nombre;
        this.precio = precio;
        this.fecha = fecha;
    }


    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Género: " + this.name() + ", Nombre: " + nombre + ", Precio: $" + precio + ", Fecha: " + fecha;
    }

}
