package yandrLearning.shildtTasks.part7.methodsOverriding;

public class OverrideTest {
    public static void main(String[] args) {
        A b = new B(1, 2, 3);
        B b2 = new B(4, 5, 6);
        b.show();
//        b.show(" done"); error: reference type A does not have an overloaded method
        b2.show();
        b2.show(" done");
    }
}

class A {
    int i;
    int j;

    public A(int i, int j) {
        this.i = i;
        this.j = j;
    }

    void show() {
        System.out.print("i = " + i + ", j = " + j);
    }
}

class B extends A {
    int k;

    public B(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    @Override
    void show() {
        super.show();
        System.out.println(", k = " + k);
    }

    void show(String msg) {
        super.show();
        System.out.println(", k = " + k + msg);
    }
}
