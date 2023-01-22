package yandrLearning.shildtTasks.part12.tasks;

public class TrafficLightTest {
    public static void main(String[] args) {
        TrafficSimulator tl = new TrafficSimulator(TrafficLightColor.GREEN);
        Thread thrd = new Thread(tl);
        thrd.start();
        for (int i = 0; i < 9; i++) {
            System.out.println(tl.getColor());
            tl.waitForChange();

        }tl.cancel();
    }
}

enum TrafficLightColor {
    RED(12000), GREEN(10000), YELLOW(2000);
    final private int delay;

    public int getDelay() {
        return delay;
    }

    TrafficLightColor(int delay) {

        this.delay = delay;
    }
}

class TrafficSimulator implements Runnable {

    private TrafficLightColor color;
    boolean stop = false;
    boolean change = false;

    public TrafficSimulator(TrafficLightColor color) {
        this.color = color;
    }

    public TrafficSimulator() {
        color = TrafficLightColor.RED;
    }

    synchronized public TrafficLightColor getColor() {
        return color;
    }

    synchronized void cancel() {
        stop = true;
    }

    @Override
    public void run() {
        while (!stop) {
            try {
                Thread.sleep(color.getDelay());
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            changeColor();
        }
    }


    synchronized void changeColor() {
        switch (color) {
            case RED:
                color = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                color = TrafficLightColor.RED;
                break;
            case GREEN:
                color = TrafficLightColor.YELLOW;
                break;
        }
        change = true;
        notify();
    }

    synchronized void waitForChange() {
        try {
            while (!change)
                wait(); // ожидать переключения цвета светофора
            change = false;
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
