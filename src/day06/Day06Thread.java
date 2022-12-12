package day06;

import java.lang.reflect.Executable;
import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Day06Thread {
    public static void main(String[] args) {
        List<Integer> numbList = 

        ExecutorService threadpool = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 3; i++) {
            // Create a thread
            RandomNumbers thr = new RandomNumbers("thr-%d".formatted(i), 100);
            // Schedule a thread to the Runnable
            threadpool.submit((thr));
        }
        
        System.out.println("All done");
        while (true) {
            for (int i : numbList)
            try {
                Thread.sleep(Duration.ofSeconds(30));
                System.out.println(">>> numList: " + numbList);
            } catch (InterruptedException e) {}
            }

        }
}