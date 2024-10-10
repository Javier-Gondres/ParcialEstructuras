public class PrintService {
    private PrintQueue printQueue = new PrintQueue();

    public void enqueue(PrintJob job){
        printQueue.enqueue(job);
    }

    public PrintJob dequeue(){
        PrintJob print = printQueue.dequeue();
        return print;
    }

    public void showQueue(){
        printQueue.showQueue();
    }
}
