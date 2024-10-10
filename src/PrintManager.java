import java.util.List;

public class PrintManager {

    private PrintService printService = new PrintService();

    public void insertPrintJobs (List<PrintJob> jobs) {
        System.out.println("Insertando impresiones...");
        for(PrintJob job : jobs){
            printService.enqueue(job);
        }
    }

    public void getPrintJob () {
        PrintJob job = printService.dequeue();

        if(job == null){
            System.out.println("Ya no hay mas impresiones");
            return;
        }

        System.out.println("Se ha recuperado esta impresion: \n");
        job.print();
    }

    public void showPrintJobs(){
        printService.showQueue();
    }
}
