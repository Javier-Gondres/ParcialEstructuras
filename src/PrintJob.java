import java.time.LocalTime;

public class PrintJob {
    private String nombre;
    private LocalTime horaDeEnvio;
    private PrintJob.Prioridad prioridad;

    enum Prioridad {L, M, A,}

    public PrintJob(String nombre, LocalTime horaDeEnvio, PrintJob.Prioridad prioridad) {
        this.nombre = nombre;
        this.horaDeEnvio = horaDeEnvio;
        this.prioridad = prioridad;

        if(prioridad == null){
            this.prioridad = Prioridad.M;
        }
    }

    public void print() {
        System.out.println("Nombre: " + nombre + "\n" + "Hora de envio: " + horaDeEnvio + "\n" + "Prioridada: " + prioridad + "\n");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getHoraDeEnvio() {
        return horaDeEnvio;
    }

    public void setHoraDeEnvio(LocalTime horaDeEnvio) {
        this.horaDeEnvio = horaDeEnvio;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }
}
