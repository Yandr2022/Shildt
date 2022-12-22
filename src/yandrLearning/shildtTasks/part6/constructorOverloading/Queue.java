package yandrLearning.shildtTasks.part6.constructorOverloading;

public class Queue {
    char[] q;
    int putloc, getloc;

    Queue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    public Queue(Queue queue) {
        q = new char[queue.q.length];
        putloc = queue.putloc;
        getloc = queue.getloc;
        for (int i = getloc ; i <= putloc; i++) {
            q[i] = queue.q[i];
        }
    }

    public Queue(char[] q) {
        this.q = new char[q.length + 1];
        putloc = getloc = 0;
        for (int i = 0; i < q.length; i++) {
            put(q[i]);
        }
    }

    void put(char ch) {
        if (putloc == q.length-1) {
            System.out.println("Queue is full");
            return;
        }
        q[putloc++] = ch;
    }

    char get() {
        if (getloc == putloc) {
            System.out.println("Queue is empty");
            return (char) 0;
        }
        return q[getloc++];
    }

}
 class QTest{
     public static void main(String[] args) {
         int size = 10;
         Queue queue = new Queue(10);
         for (int i = 0; i <size ; i++) {
             queue.put((char) ('A'+ i));
         }
         Queue queue1 = new Queue(new char[]{'T','o','m'});
         Queue queue2 = new Queue(queue);
         System.out.print("queue: ");
         for (int i = 0; i < queue.q.length-1; i++)
             System.out.print(queue.get());
         System.out.print("\nqueue1: ");
         for (int i = 0; i < queue1.q.length-1; i++)
             System.out.print(queue1.get());
         System.out.print("\nqueue2: ");
         for (int i = 0; i < queue2.q.length-1; i++)
             System.out.print(queue2.get());

     }
 }