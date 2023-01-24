package yandrLearning.shildtTasks.part11.notify;

public class UseNotifyAndWaitTest {
    public static void main(String[] args) {
        TickTock tickTock = new TickTock();
        TickTockThread thread = TickTockThread.createAndStart("Tick", tickTock);
        TickTockThread thread1 = TickTockThread.createAndStart("Tock", tickTock);
        try {
            thread.thread.join();
            thread1.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main Thread interrupted");
        }
    }
}

class TickTock {
    String state;

    synchronized void tick(boolean running) {
        if (!running) {
            state = "ticked";
            notify();
            return;
        }
        System.out.println("Tick ");
        state = "ticked";
        notify();
        try {
            while (!state.equals("tocked"))
            wait();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    synchronized void tock(boolean running) {
        if (!running) {
            state = "tocked";
            notify();
            return;
        }
        System.out.println("Tock ");
        state = "tocked";
        notify();
        try {
            while (!state.equals("ticked"))
            wait();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

class TickTockThread implements Runnable {
    Thread thread;
    TickTock tickTock;

    TickTockThread(String name, TickTock tickTock) {
       thread = new Thread(this,name);
        this.tickTock = tickTock;
    }

    public static TickTockThread createAndStart(String name, TickTock tickTock) {
        TickTockThread thread = new TickTockThread(name, tickTock);
        thread.thread.start();
        return thread;
    }

    @Override
    public void run() {
        if (thread.getName().compareTo("Tick") == 0) {
            for (int i = 0; i < 5; i++) tickTock.tick(true);
            tickTock.tick(false);
        } else {
            for (int i = 0; i < 5; i++) tickTock.tock(true);
            tickTock.tock(false);
        }
    }
}


