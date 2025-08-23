package multithreading.executorframework;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcService {


        private static long factorial(int n)  {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            long fact = 1;
            for (int i = 2; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }

        public static void main(String[] args) throws InterruptedException {
            long startTime= System.currentTimeMillis();
            //array of threads

            ExecutorService executor= Executors.newFixedThreadPool(9);
            for (int i = 1; i < 10; i++) {
                int x=i;
                executor.submit(
                        ()->{
                            long result=factorial(x);
                            System.out.println(result);
                        }
                );

            }
           // System.out.println("Total time "+(System.currentTimeMillis()-startTime));

           executor.shutdown();


        }
    }


