import java.text.SimpleDateFormat;
import java.util.Date;

public class Disponibilidad {
    private String Vuelo;
    private String Asiento;
    private Boolean TareaCompletada;
    private Date FechaVuelo;

    public Disponibilidad(String Vuelo, String Asiento, Boolean TareaCompletada, Date FechaTarea) {
        this.Vuelo = Vuelo;
        this.Asiento = Asiento;
        this.TareaCompletada = false;
        this.FechaVuelo = FechaTarea;

    }
    public String getVuelo() {
        return Vuelo;
    }
    public Boolean getTareaCompletada() {
        return TareaCompletada;
    }
    public Date getFechaTarea() {
        return FechaVuelo;
    }

    public void setVuelo(String vuelo) {
        Vuelo = vuelo;
    }
    public void setTareaCompletada(Boolean tareacompletada) {
        TareaCompletada = tareacompletada;
    }
    public void setFechaTarea(Date fechatarea) {
        FechaVuelo = fechatarea;
        Date objDate = new Date();
        System.out.println(objDate);
        String strDateFormat = " HH: mm: ss dd-MMM-aaaa";
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
        System.out.println(objSDF.format(objDate));
    }}
