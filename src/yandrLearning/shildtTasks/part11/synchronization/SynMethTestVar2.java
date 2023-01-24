package yandrLearning.shildtTasks.part11.synchronization;

public class SynMethTestVar2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        My_Thread thread = My_Thread.createAndStart("Thread 1", array);
        My_Thread thread1 = My_Thread.createAndStart("Thread 2", array);

        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

    }
}

class Sum_Array {
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

class My_Thread extends Thread {
    static Sum_Array sumArray = new Sum_Array();
    int[] array;
    int answer;

     My_Thread(String name, int[] array) {
        super(name);
        this.array = array;
    }

    public static My_Thread createAndStart(String name, int[] array) {
        My_Thread myThread = new My_Thread(name, array);
        myThread.start();
        return myThread;
    }

    @Override
    public void run() {
        System.out.println(getName() + " is running");
        answer = sumArray.getSum(array);
        System.out.println("Final sum for " + getName() + " = " + answer);
        System.out.println(getName() + " interrupted");
    }
}
