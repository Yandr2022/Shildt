package yandrLearning.shildtTasks.part8.interfaces;

public class ByThrees implements Series {
    private int val;
    private int start;

    public ByThrees() {
        val = this.start = 0;
    }

    public ByThrees(int start) {
        val = this.start = start;
    }

    @Override
    public int getNext() {
        val += 3;
        return val;
    }

    @Override
    public void reset() {
        val = this.start = 0;
    }

    @Override
    public void setStart(int startPoint) {
        start = val = startPoint;
    }
}
class ByThreesTest {
    public static void main(String[] args) {
        ByThrees byThrees = new ByThrees();
        for (int i = 0; i <= 5; i++) {
            System.out.print(byThrees.getNext() + " ");
        }
        System.out.println();
        byThrees.reset();
        for (int i = 0; i <= 10; i++) {
            System.out.print(byThrees.getNext() + " ");
        }
        System.out.println();
        byThrees.setStart(100);
        for (int i = 0; i <= 5; i++) {
            System.out.print(byThrees.getNext() + " ");
        }
        System.out.println();
        byThrees = new ByThrees(11);
        for (int i = 0; i <= 5; i++) {
            System.out.print(byThrees.getNext() + " ");
        }
    }
}