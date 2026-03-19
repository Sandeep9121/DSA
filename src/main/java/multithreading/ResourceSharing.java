package multithreading;

public class ResourceSharing {

    public  synchronized void useResource(String threadName){
        System.out.println(threadName +" using the resource");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


    public static void main(String[] args) {
         ResourceSharing rs=new ResourceSharing();

        Runnable task = ()->{
            for (int i = 0; i < 3; i++) {
                rs.useResource(Thread.currentThread().getName());
            }
        };

        Thread t1=new Thread(task,"t1");
        Thread t2=new Thread(task,"t2");

        t1.start();
        t2.start();



    }
}
