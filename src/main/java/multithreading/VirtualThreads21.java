package multithreading;

public class VirtualThreads21 {

    public static void main(String[] args) {

        Thread.startVirtualThread(()->{
            System.out.println("Java 21 practice first virtual thread");
        });

    }
}
