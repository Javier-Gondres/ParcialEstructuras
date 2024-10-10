import java.util.LinkedList;
import java.util.Queue;

public class PrintQueue {
    Queue<PrintJob> printJobs = new LinkedList<>();

    public void enqueue(PrintJob job){
        printJobs.offer(job);
    }

    public PrintJob dequeue(){
        PrintJob print = printJobs.poll();
        return print;
    }

    public void showQueue(){
        if(printJobs.isEmpty()){
            System.out.println("Ya no hay mas impresiones en espera.");
            return;
        }
        printJobs.forEach(printJob -> printJob.print());
    }
}
