package yandrLearning.shildtTasks.part11;

public class UseMain {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("Main thread name: " + thread.getName());
        System.out.println("Main thread priority: " + thread.getPriority());
        System.out.println();
        thread.setName("#1");
        thread.setPriority(Thread.NORM_PRIORITY+3);
        System.out.println("Main thread new name: " + thread.getName());
        System.out.println("Main thread new priority: " + thread.getPriority());
    }
}
