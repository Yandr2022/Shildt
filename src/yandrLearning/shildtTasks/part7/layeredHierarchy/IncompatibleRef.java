package yandrLearning.shildtTasks.part7.layeredHierarchy;

public class IncompatibleRef {
    public static void main(String[] args) {
        X x = new X(10);
        X x2;
        Y y = new Y(5);
        x2 = x;
//        x2 = y; error: Incompatible References

    }
}
class X{
    int i;

    public X(int i) {
        this.i = i;
    }
}
class Y{
    int i;

    public Y(int i) {
        this.i = i;
    }
}
