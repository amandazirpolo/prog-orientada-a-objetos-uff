import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws Exception {

        Array l1 = new Array();
        Array l2 = new Array();

        l1.preencheArray(10);
        l2.preencheArray(15);

        int nthreads = 4;

        Callable<MultiThreading> thread1 = new MultiThreading(l1);
        Callable<MultiThreading> thread2 = new MultiThreading(l2);

        thread1.call();
        thread2.call();
        
        ExecutorService executor = Executors.newFixedThreadPool(nthreads);
        CompletionService<MultiThreading> completionService = new ExecutorCompletionService<>(executor);

        completionService.submit(thread1);
        completionService.submit(thread2);

        boolean resp = true;
        Future<MultiThreading> result = completionService.take();
        while(!resp){
            try{
                MultiThreading resultado = result.get();
                System.out.println("media: " + resultado.arrayValores.result);
            } catch (Exception e){
                resp = true;
            }
        }
        
        executor.shutdown();
    }
}