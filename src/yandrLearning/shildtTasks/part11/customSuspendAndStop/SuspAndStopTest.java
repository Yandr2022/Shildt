package yandrLearning.shildtTasks.part11.customSuspendAndStop;

public class SuspAndStopTest {
    public static void main(String[] args) {
        MyThread thread = MyThread.createAndStart("My Thread");
        try {
            Thread.sleep(1000);

            thread.mysuspend();
            System.out.println("Suspend Thread");
            Thread.sleep(1000);

            thread.myresume();
            System.out.println("Resumption Thread");
            Thread.sleep(1000);

            thread.mysuspend();
            System.out.println("Suspend Thread");
            Thread.sleep(1000);

            thread.myresume();
            System.out.println("Resumption Thread");
            Thread.sleep(1000);

            thread.mystop();
            System.out.println("Stopped Thread");
            Thread.sleep(1000);

        }catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        try {
            thread.thread.join();
        }catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread - exit");

    }
}

class MyThread implements Runnable {
    Thread thread;
    boolean suspended;
    boolean stopped;

    public MyThread(String name) {
        thread = new Thread(this, name);
        suspended = false;
        stopped = false;
    }

    public static MyThread createAndStart(String name) {
        MyThread myThread = new MyThread(name);
        myThread.thread.start();
        return myThread;
    }

    public void run() {
        System.out.println(thread.getName() + " is running");
        try {
            for (int i = 0; i < 1000; i++) {
                System.out.print(i + " ");
                if (i % 10 == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }
                synchronized (this) {
                    while (suspended) {
                        wait();
                    }
                    if (stopped) break;
                }
            }

        } catch (InterruptedException e) {
            System.out.println(thread.getName() + " interrupted");
        }
        System.out.println(thread.getName() + " - exit");
    }

    synchronized void mystop() {
        stopped = true;
        suspended = false;
        notify();
    }

    synchronized void mysuspend() {
        suspended = true;
    }

    synchronized void myresume() {
        suspended = false;
        notify();
    }

}
