package yandrLearning.shildtTasks.part7.layeredHierarchy;

public class OrderOfConstruction {
    public static void main(String[] args) {
        C c = new C();

    }
}

class A {
    public A() {
        System.out.println("constructor A");
    }
}

class B extends A {
    public B() {
        System.out.println("constructor B");
    }
}

class C extends B {
    public C() {
        System.out.println("constructor C");
    }
}
