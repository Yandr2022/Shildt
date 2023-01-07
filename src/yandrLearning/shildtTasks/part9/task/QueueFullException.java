package yandrLearning.shildtTasks.part9.task;

public class QueueFullException extends Exception {
    int size;

    public QueueFullException(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "\nQueue is full. Max size " + size + " elements";
    }
}
