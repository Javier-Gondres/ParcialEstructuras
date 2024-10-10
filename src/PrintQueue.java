import java.util.LinkedList;
import java.util.Queue;

public class PrintQueue {
    Queue<PrintJob> printJobs = new LinkedList<>();

    /*
     * Inserta un elemento al principio de la cola
     * */
    public void enqueue(PrintJob job){
        printJobs.offer(job);
    }

    /*
     * Devuelve la impresion que se encuentre al frente
     * */
    public PrintJob dequeue(){
        PrintJob print = printJobs.poll();
        return print;
    }

    /*
     * Muestra todas las impresiones
     * */
    public void showQueue(){
        if(printJobs.isEmpty()){
            System.out.println("Ya no hay mas impresiones en espera.");
            return;
        }
        printJobs.forEach(printJob -> printJob.print());
    }
}
