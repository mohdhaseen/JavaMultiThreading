package M_ThreadLocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
       for (int i=0;i<6;i++){
           executorService.execute(new SampleRunnable());
       }
    }

}
