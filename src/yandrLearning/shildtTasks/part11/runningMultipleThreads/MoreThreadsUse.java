package yandrLearning.shildtTasks.part11.runningMultipleThreads;



public class MoreThreadsUse {
    public static void main(String[] args) {
        System.out.println("Start Main thread");
        Mythread.createAndStart("Thread 1");
        Mythread.createAndStart("Thread 2");
        Mythread.createAndStart("Thread 3");

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }
        System.out.println("Main thread completed");
    }
}


class Mythread implements Runnable {
    Thread thread;

    public Mythread(String name) {
        thread = new Thread(this, name);
        System.out.println(name + " created");
    }

    public static   Mythread createAndStart(String name) {
         Mythread mythread = new  Mythread(name);
        mythread.thread.start();
        return mythread;
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " is running");
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("IN " + thread.getName() + " counter = " + i);
            }
        } catch (InterruptedException e) {
            System.out.println(thread.getName() + " interrupted");
        }
        System.out.println(thread.getName() + " completed");
    }

}
