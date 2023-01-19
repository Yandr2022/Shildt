package yandrLearning.shildtTasks.part11.runningMultipleThreads;

public class UseJoinThread {
        public static void main(String[] args) {
            System.out.println("Start Main thread");
           My_Thread thread =  My_Thread.createAndStart("Thread 1");
           My_Thread thread1 =   My_Thread.createAndStart("Thread 2");
           My_Thread thread2 =  My_Thread.createAndStart("Thread 3");
                try {
                    thread.join();
                    System.out.println(thread.getName()+ " is joined");
                    thread1.join();
                    System.out.println(thread1.getName()+ " is joined");
                    thread2.join();
                    System.out.println(thread2.getName()+ " is joined");
                } catch (InterruptedException e) {
                    System.out.println("Main thread interrupted");
                }
            System.out.println("Main thread completed");
        }
    }

class My_Thread extends Thread {

    public My_Thread(String name) {
        super(name);
    }

    public static  My_Thread createAndStart(String name) {
        My_Thread mythread = new  My_Thread(name);
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
