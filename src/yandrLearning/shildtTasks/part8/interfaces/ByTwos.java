package yandrLearning.shildtTasks.part8.interfaces;

public class ByTwos implements Series {
    private int val;
    private int start;
    private int prev;

    public ByTwos() {
        val = start = 0;
        prev = -2;
    }

    public ByTwos(int start) {
        val = this.start = start;
        prev = start -2;
    }

    @Override
    public int getNext() {
        prev = val;
        val += 2;
        return val;
    }

    public int getPrevious() {
         val = prev ;
        prev -= 2;
        return val;
    }

    @Override
    public void reset() {
        val = start = 0;
        prev = -2;
    }

    @Override
    public void setStart(int startPoint) {
        val = start = startPoint;
        prev = startPoint -2;
    }
}

class ByTwoTest {
    public static void main(String[] args) {
        ByTwos byTwos = new ByTwos();
        for (int i = 0; i <= 5; i++) {
            System.out.print(byTwos.getNext() + " ");
        }
        for (int i = 0; i <= 5; i++) {
            System.out.print(byTwos.getPrevious() + " ");
        }
        System.out.println();
        byTwos.reset();
        for (int i = 0; i <= 10; i++) {
            System.out.print(byTwos.getNext() + " ");
        }
        for (int i = 0; i <= 10; i++) {
            System.out.print(byTwos.getPrevious() + " ");
        }
        System.out.println();
        byTwos.setStart(100);
        for (int i = 0; i <= 5; i++) {
            System.out.print(byTwos.getNext() + " ");
        }
        for (int i = 0; i <= 5; i++) {
            System.out.print(byTwos.getPrevious() + " ");
        }
        System.out.println();
        byTwos = new ByTwos(11);
        for (int i = 0; i <= 5; i++) {
            System.out.print(byTwos.getNext() + " ");
        }
        for (int i = 0; i <= 5; i++) {
            System.out.print(byTwos.getPrevious() + " ");
        }
    }
}