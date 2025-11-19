package multithreading.executorframework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

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

           executor.shutdown();
           executor.awaitTermination(100, TimeUnit.SECONDS);
            System.out.println("Total time "+(System.currentTimeMillis()-startTime));


       // returning something
            ExecutorService executor1= Executors.newFixedThreadPool(1);

                Future<?> future= executor1.submit(
                        ()->3
                );
            try {
                System.out.println(future.get());
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }

   // second variation

            Future<?> future2= executor1.submit(
                    ()-> System.out.println(""),3
            );
            try {
                System.out.println(future.get());
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }

            // Invoke all
            // invoke all is bocking quue

            Callable<Integer> c=()->1;
            Callable<Integer> c1=()->3;
            Callable<Integer> c2=()->6;
          List<Future<Integer>> list= executor1.invokeAll(Arrays.asList(c,c1,c2));

          for (Future<Integer> f :list){
              try {
                  System.out.println(f.get());
              } catch (ExecutionException e) {
                  throw new RuntimeException(e);
              }
          }
          executor1.shutdown();
        }




    }


