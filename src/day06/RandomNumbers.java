package day06;

import java.util.Random;
import java.security.SecureRandom;

public class RandomNumbers implements Runnable {


    public RandomNumbers implement Runnable {
        private String name;
        private Integer range;
        private List<Integer> numbList;
        public RandomNumbers(String name, Integer range, List<Integer) numbList)
        
    }
    
    @Override
    public void run() {
        // The body of the thread
        Random rand = new SecureRandom();
        for (int i = 0; i < 10; i++) {
            System.out.printf(">>> %d\n", rand.nextInt(100));
        }
    }
}
