package multithreading;

public class PrintEvenOdd {

    int limit;
    public PrintEvenOdd(int limit){
        this.limit=limit;
    }
     volatile  static int count=1;

    public synchronized void printEven(){
        while(count<limit){

            if(count%2==0){
                System.out.println(Thread.currentThread().getName()+" "+count);
                count++;
                notifyAll();
            }else {
                try {
                    wait();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

        }

    }

    public synchronized void printOdd(){
        while(count<limit){

            if(count%2!=0){
                System.out.println(Thread.currentThread().getName()+" "+count);
                count++;
                notifyAll();
            }else {
                try {
                    wait();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }


    }

    public static void main(String[] args) {
        PrintEvenOdd p =new  PrintEvenOdd(20);

        Thread t= new Thread(
            ()->{
                p.printOdd();
            }
        ,"t1");

        Thread t2= new Thread(
                ()->{
                    p.printEven();
                }
        ,"t2");

        t.start();
        t2.start();

    }


}
