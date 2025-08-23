package multithreading;

class Counter {
    private int count = 0;

    public void increment() {
        count++;
    }

// Sync block
//    public void increment() {
//        synchronized (this) { // lock only this part
//            count++;
//        }
//    }
    public int getCount() {
        return count;
    }
}
