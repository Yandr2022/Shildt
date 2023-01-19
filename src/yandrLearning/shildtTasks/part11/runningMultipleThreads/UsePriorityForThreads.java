package yandrLearning.shildtTasks.part11.runningMultipleThreads;

public class UsePriorityForThreads {
    public static void main(String[] args) {
        Priority priority  = new Priority("High priority thread");
        Priority priority1  = new Priority("Low priority thread");
        Priority priority2  = new Priority("Norm priority thread1");
        Priority priority3  = new Priority("Norm priority thread2");
        Priority priority4  = new Priority("Norm priority thread3");
        priority.thrd.setPriority(Thread.NORM_PRIORITY+2);
        priority1.thrd.setPriority(Thread.NORM_PRIORITY-2);

        priority.thrd.start();
        priority1.thrd.start();
        priority2.thrd.start();
        priority3.thrd.start();
        priority4.thrd.start();

        try {  priority.thrd.join();
        priority1.thrd.join();
        priority2.thrd.join();
        priority3.thrd.join();
        priority4.thrd.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("\nCounter High priority thread: "+ priority.count);
        System.out.println("\nCounter Low priority thread: "+ priority1.count);
        System.out.println("\nCounter Norm priority thread1: "+ priority2.count);
        System.out.println("\nCounter Norm priority thread2: "+ priority3.count);
        System.out.println("\nCounter Norm priority thread3: "+ priority4.count);
    }
}
class Priority implements Runnable{
    int count;
    Thread thrd;

    static boolean stop = false;
    static String currentName;

    public Priority(String name) {
        thrd = new Thread(this,name);
        count = 0;
        currentName = name;
        System.out.println(name + " created");
    }

    @Override
    public void run() {
        while (!stop&&count < 1000){
            count++;
            currentName =currentName.compareTo(thrd.getName())!=0? thrd.getName() : currentName;
            System.out.println(currentName + " is running");
        }
        stop = true;
        System.out.println("\n"+thrd.getName()+" interrupted");
    }
}
