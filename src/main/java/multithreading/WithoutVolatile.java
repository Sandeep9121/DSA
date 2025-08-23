package multithreading;

public class WithoutVolatile extends Thread {


        private boolean running = true;  // never ending loop

   // private volatile boolean running = true;
        @Override
        public void run() {
            while (running) {
              //  System.out.println("i am running");
            } // may never stop if cached!
            System.out.println("Thread stopped");
        }

        public void stopRunning() {
            running = false;
        }

        public static void main(String[] args) throws InterruptedException {
            WithoutVolatile demo = new WithoutVolatile();
            demo.start();
            Thread.sleep(1000);
            demo.stopRunning();  // main thread sets running=false    but fails to notify the other thread
            // if you make the scope of a runner as a volatile
        }


}
