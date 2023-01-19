package yandrLearning.shildtTasks.part11.createdThread;

public class UseThread_Ext {
    public static void main(String[] args) {
        System.out.println("Start Main thread");
        My_thread thread = My_thread.createAndStart("Thread 1");
//        My_thread thread = new My_thread("Thread 1");
//        thread.start();
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

class My_thread extends Thread {

    public My_thread(String name) {
        super(name);
    }

    public static My_thread createAndStart(String name) {
        My_thread mythread = new My_thread(name);
        mythread.start();
        return mythread;
    }

    @Override
    public void run() {
        System.out.println(getName() + " is running");
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("IN " + getName() + " counter = " + i);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted");
        }
        System.out.println(getName() + " completed");
    }
}
