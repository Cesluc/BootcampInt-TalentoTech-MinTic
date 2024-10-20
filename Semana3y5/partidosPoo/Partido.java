package partidosPoo;

public class Partido extends EventoDeportivo {
    
    private int golesRival;
    private int golesUni;
    
    public Partido(String fecha, String nombreRival, int golesRival, int golesUni) {
        super(fecha, "UNI", nombreRival);
        this.golesRival = golesRival;
        this.golesUni = golesUni;
    }

    public int getGolesRival() {
        return golesRival;
    }

    public int getGolesUni() {
        return golesUni;
    }

    public void setGolesUni(int golesUni) {
        this.golesUni = golesUni;
    }

    @Override
    public String mostrarResultado() {
        return getFecha() + " - " + getNombreLocal() + " (" + golesUni + ") VS (" + golesRival + ") " + getNombreRival();

    }

}
