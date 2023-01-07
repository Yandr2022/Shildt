package yandrLearning.shildtTasks.part9.task;

public class FixQueueExcTest {
    public static void main(String[] args) {
        FixedQueue queue = new FixedQueue(10);
        try {
            for (int i = 0; i < 11; i++) {
                System.out.print("trying to save a value "+ (char) ('S' + i)+ "...");
                queue.put((char) ('S' + i));
                System.out.println("Successfully!!!");
            }
        } catch (QueueFullException e) {
            System.out.println(e);
        }
        try {
            for (int i = 0; i < 11; i++) {
                System.out.print(queue.get());
            }
        } catch (QueueEmptyException e) {
            System.out.print(e);
        }
    }

}

interface CharQueue {
    void put(char ch) throws QueueFullException;

    char get() throws QueueEmptyException;
}

class FixedQueue implements CharQueue {
    private char[] q;
    int getloc, putloc;

    public FixedQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    @Override
    public void put(char ch) throws QueueFullException {
        if (putloc == q.length) {
            throw new QueueFullException(q.length);
        }
        q[putloc++] = ch;
    }

    @Override
    public char get() throws QueueEmptyException {
        if (getloc == putloc) {
            throw new QueueEmptyException();
        }
        return q[getloc++];
    }
}

