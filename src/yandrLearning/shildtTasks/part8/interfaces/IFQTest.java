package yandrLearning.shildtTasks.part8.interfaces;

public class IFQTest {
    public static void main(String[] args) {
        CharQueue[] queues = {new FixedQueue(10), new CircularQueue(10), new DynamicQueue(5)};
        char ch = 'A';
        for (CharQueue queue : queues) {
            for (int j = 0; j < 10; j++) {
                queue.put((char) (ch + j));
            }
        }
        for (CharQueue queue : queues) {
            for (int j = 0; j < 10; j++) {
                System.out.print(queue.get());
            }
            System.out.println();
        }
CharQueue queue = new CircularQueue(10);
        for (int i = 0; i < 20; i++) {
            queue.put((char) (ch +i));
            System.out.println(queue.get());
        }
    }
}


interface CharQueue {
    void put(char ch);

    char get();
}

class FixedQueue implements CharQueue {
    private char[] q;
    int getloc, putloc;

    public FixedQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    @Override
    public void put(char ch) {
        if (putloc == q.length) {
            System.out.println("Queue is full");
            return;
        }
        q[putloc++] = ch;
    }

    @Override
    public char get() {
        if (getloc == putloc) {
            System.out.println("Queue is empty");
            return (char) 0;
        }
        return q[getloc++];
    }
}

class CircularQueue implements CharQueue {
    private char[] q;
    int getloc, putloc;

    public CircularQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    @Override
    public void put(char ch) {
        if ((putloc + 1 == getloc) | ((putloc == q.length - 1) & (getloc == 0))) {
            System.out.println("Queue is full");
            return;
        }
        q[putloc++] = ch;
    }

    @Override
    public char get() {
        if (getloc == putloc) {
            System.out.println("Queue is empty");
            return (char) 0;
        }
        char ch = q[getloc++];
        if (getloc == q.length) getloc = 0;
        return q[getloc];
    }
}

class DynamicQueue implements CharQueue {
    private char[] q;
    int getloc, putloc;

    public DynamicQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    @Override
    public void put(char ch) {
        if (putloc == q.length) {
            char t[] = new char[q.length + 1];
            for (int i = 0; i < q.length; i++) {
                t[i] = q[i];
            }
            q = t;
        }
        q[putloc++] = ch;
    }

    @Override
    public char get() {
        if (getloc == putloc) {
            System.out.println("Queue is empty");
            return (char) 0;
        }
        return q[getloc++];
    }
}

