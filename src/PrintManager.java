import java.util.List;

public class PrintManager {

    private PrintService printService = new PrintService();

    /*
    * Inserta un arreglos de impresiones en una cola
    * */
    public void insertPrintJobs (List<PrintJob> jobs) {
        System.out.println("Insertando impresiones...");
        for(PrintJob job : jobs){
            printService.enqueue(job);
        }
    }

    /*
    * Devuelve la impresion en la primera posicion de la cola
    * */
    public void getPrintJob () {
        PrintJob job = printService.dequeue();

        if(job == null){
            System.out.println("Ya no hay mas impresiones");
            return;
        }

        System.out.println("Se ha recuperado esta impresion: \n");
        job.print();
    }

    /*
    * Imprime todos los elementos de la cola
    * */
    public void showPrintJobs(){
        printService.showQueue();
    }
}
