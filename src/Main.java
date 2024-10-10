import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PrintManager manager = new PrintManager();
        List<PrintJob> jobs = new ArrayList<>(10);
        PrintJob printJob1 = new PrintJob("Impresion 1", LocalTime.now(), PrintJob.Prioridad.L);
        PrintJob printJob2 = new PrintJob("Impresion 2", LocalTime.now(), PrintJob.Prioridad.A);
        PrintJob printJob3 = new PrintJob("Impresion 3", LocalTime.now(), PrintJob.Prioridad.A);
        PrintJob printJob4 = new PrintJob("Impresion 4", LocalTime.now(), PrintJob.Prioridad.M);
        PrintJob printJob5 = new PrintJob("Impresion 5", LocalTime.now(), PrintJob.Prioridad.L);
        jobs.add(printJob1);
        jobs.add(printJob2);
        jobs.add(printJob3);
        jobs.add(printJob4);
        jobs.add(printJob5);

        manager.insertPrintJobs(jobs);

        manager.showPrintJobs();

        manager.getPrintJob();
        manager.getPrintJob();
        manager.getPrintJob();

        System.out.println("Impresiones luego de haber sacado las primeras 3: ");
        manager.showPrintJobs();

        manager.getPrintJob();
        manager.getPrintJob();

        System.out.println("Impresiones luego de haber sacado las ultimas 2: ");
        manager.showPrintJobs();
        System.out.println("\n");

        System.out.println("Intentando obtener otra impresion cuando ya no hay mas: ");
        manager.getPrintJob();
    }
}