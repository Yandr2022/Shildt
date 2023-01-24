package yandrLearning.shildtTasks.part11.synchronization;

public class SynMethTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        MyThread thread = MyThread.createAndStart("Thread 1", array);
        MyThread thread1 = MyThread.createAndStart("Thread 2", array);

        try {
            thread.thread.join();
            thread1.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

    }
}
class SumArray {
    private int sum;

    synchronized int getSum(int[] array) {
        sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            System.out.println("Current value sum for " + Thread.currentThread().getName() + " = " + sum);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted");
            }
        }
        return sum;
    }
}
class MyThread implements Runnable {
    Thread thread;
    static SumArray sumArray = new SumArray();
    int[] array;
    int answer;

    public MyThread(String name, int[] array) {
        thread = new Thread(this, name);
        this.array = array;
    }

    public static MyThread createAndStart(String name, int[] array) {
        MyThread myThread = new MyThread(name, array);
        myThread.thread.start();
        return myThread;
    }

    @Override
    public void run() {

        System.out.println(thread.getName() + " is running");
        answer = sumArray.getSum(array);
        System.out.println("Final sum for " + thread.getName() + " = " + answer);
        System.out.println(thread.getName() + " interrupted");
    }
}
