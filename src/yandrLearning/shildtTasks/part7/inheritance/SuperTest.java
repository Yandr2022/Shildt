package yandrLearning.shildtTasks.part7.inheritance;

public class SuperTest {
    public static void main(String[] args) {
        B b = new B(5, 10);
        b.show();
    }
}

class A {
    int i;
}

class B extends A {
    int i;

    public B(int iP, int iC) {
        super.i = iP;
        i = iC;
    }

    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}