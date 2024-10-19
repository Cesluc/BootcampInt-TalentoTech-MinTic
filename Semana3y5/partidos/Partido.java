package partidos;

public class Partido {
    
    private String fecha;
    private String nombreRival;
    private int golesRival;
    private int golesUni;
    
    public Partido(String fecha, String nombreRival, int golesRival, int golesUni) {
        this.fecha = fecha;
        this.nombreRival = nombreRival;
        this.golesRival = golesRival;
        this.golesUni = golesUni;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombreRival() {
        return nombreRival;
    }

    public void setNombreRival(String nombreRival) {
        this.nombreRival = nombreRival;
    }

    public int getGolesRival() {
        return golesRival;
    }

    public void setGolesRival(int golesRival) {
        this.golesRival = golesRival;
    }

    public int getGolesUni() {
        return golesUni;
    }

    public void setGolesUni(int golesUni) {
        this.golesUni = golesUni;
    }

    @Override
    public String toString() {
        return fecha + " - UNI (" +  golesUni + ") VS ("+ golesRival+ ") " + nombreRival;
    }

}
