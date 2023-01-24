package yandrLearning.shildtTasks.part13.tasks;

public class GenericQueueTest {
    public static void main(String[] args) {
        Integer iStore[] = new Integer[10];
        GenQueue<Integer> q = new GenQueue<Integer>(iStore);
        Integer iVal;

        Double dStore[] = new Double[10];
        GenQueue<Double> q2 = new GenQueue<Double>(dStore);
        Double dVal;

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Addition " + i);
                q.put(i);
            }
            for (int i = 0; i < 5; i++) {
                double add = (double) i / 2;
                System.out.println("Addition " + add);
                q2.put(add);
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);

        }


        try {
            for (int i = 0; i < 5; i++) {
                iVal = q.get();
                System.out.println(" reception " + iVal);
            }
            for (int i = 0; i < 5; i++) {
                dVal = q2.get();
                System.out.println(" reception " + dVal);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }

    }
}



class GenQueue<T> implements IGenQ<T> {
    private T q[];
    private int putloc, getloc;

    public GenQueue(T[] aRef) {
        q = aRef;
        putloc = getloc = 0;
    }

    public void put(T obj) throws QueueFullException {
        if (putloc == q.length)
            throw new QueueFullException(q.length);
        q[putloc++] = obj;
    }

    public T get() throws QueueEmptyException {
        if (getloc == putloc)
            throw new QueueEmptyException();
        return q[getloc++];
    }
}
interface IGenQ<T> {

    void put(T ch) throws QueueFullException;

    T get() throws QueueEmptyException;
}

class QueueFullException extends Exception {
    private int size;

    public QueueFullException(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Full Queue. Max size " + size;
    }
}

class QueueEmptyException extends Exception {

    @Override
    public String toString() {
        return "Empty Queue";
    }
}