package yandrLearning.shildtTasks.part11.createdThread;

public class UseThread_Runn {
    public static void main(String[] args) {
        System.out.println("Start Main thread");
        Thread thread = new Thread(new MyThread("Thread 1"));
        thread.start();
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


 class MyThread implements Runnable {
    String name;

    public MyThread(String name) {
        this.name = name;
        System.out.println(name + " created");
    }

    @Override
    public void run() {
        System.out.println(name + " is running");
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("IN " + name + " counter = " + i);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted");
        }
        System.out.println(name + " completed");
    }

}
