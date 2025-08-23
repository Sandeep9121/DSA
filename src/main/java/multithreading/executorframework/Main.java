package multithreading.executorframework;

public class Main {

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

        Thread[]  threads =new Thread[9];
        for (int i = 1; i < 10; i++) {
             int x=i;
            threads[i-1] =new Thread(
                    ()->{
                        long result=factorial(x);
                        System.out.println(result);
                    }
            );
            threads[i-1].start();
        }

         for(Thread t:threads) {
             try {
                 t.join();
             }catch (InterruptedException e){
                 Thread.currentThread().interrupt();
             }
         }

        System.out.println("Total time "+(System.currentTimeMillis()-startTime));

    }
}
