package multithreading;

class BankAccount {
    private int balance = 1000;

    public  synchronized  void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance -= amount;
            System.out.println("Balance left: " + balance);
        } else {
            System.out.println("Insufficient funds for " + Thread.currentThread().getName());
        }
    }


    public   void withdrawExplicitLock(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance -= amount;
            System.out.println("Balance left: " + balance);
        } else {
            System.out.println("Insufficient funds for " + Thread.currentThread().getName());
        }
    }


    //look for lock good explaination https://www.youtube.com/watch?v=ay5ynKnI9vc
    //un fair lock https://www.youtube.com/watch?v=Iv5cP97OXlA
    //
    //https://www.youtube.com/watch?v=Ee42spqUzbE

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.withdraw(700), "Thread-1");
        Thread t2 = new Thread(() -> account.withdraw(500), "Thread-2");

        t1.start();
        t2.start();
    }
}