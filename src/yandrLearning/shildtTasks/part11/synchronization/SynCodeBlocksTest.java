package yandrLearning.shildtTasks.part11.synchronization;

public class SynCodeBlocksTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        NewThread thread = NewThread.createAndStart("Thread 1", array);
        NewThread thread1 = NewThread.createAndStart("Thread 2", array);

        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}
class SumNums {
    private int sum;

  int getSum(int[] array) {
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

class NewThread extends Thread {
    static SumNums sumArray = new SumNums();
    int[] array;
    int answer;

    NewThread(String name, int[] array) {
        super(name);
        this.array = array;
    }

    public static NewThread createAndStart(String name, int[] array) {
        NewThread myThread = new NewThread(name, array);
        myThread.start();
        return myThread;
    }

    @Override
    public void run() {
        System.out.println(getName() + " is running");
       synchronized (sumArray){
            answer = sumArray.getSum(array);
        }
        System.out.println("Final sum for " + getName() + " = " + answer);
        System.out.println(getName() + " interrupted");
    }
}