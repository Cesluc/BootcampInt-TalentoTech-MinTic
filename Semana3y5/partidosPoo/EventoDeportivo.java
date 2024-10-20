package partidosPoo;

// Si hay otra clase de eventos diferente a la de Futbol, se agrega una clase abstracta para los eventos.
public abstract class EventoDeportivo {
    
    private String fecha;
    private String nombreLocal;
    private String nombreRival;

    public EventoDeportivo(String fecha, String nombreLocal, String nombreRival) {
        this.fecha = fecha;
        this.nombreLocal = nombreLocal;
        this.nombreRival = nombreRival;
    }

    public String getFecha() {
        return fecha;
    }

    public String getNombreLocal() {
        return nombreLocal;
    }

    public String getNombreRival() {
        return nombreRival;
    }
    
    public abstract String mostrarResultado();

}
