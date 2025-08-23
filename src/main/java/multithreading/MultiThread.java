package multithreading;

public class MultiThread  extends  Thread{

    private  String task;
    public MultiThread(String task){
        this.task =task;
    }

    @Override
    public void run() {
        System.out.println(task + " is being prepared by " +
                Thread.currentThread().getName());
    }



    public static void main(String[] args) {
        Thread t =new MultiThread("thread");
        Thread t1 =new MultiThread("thread1");
        Thread t2 =new MultiThread("thread2");


        t1.start();
        t2.start();
        t.start();

        t.run();
    }
}
