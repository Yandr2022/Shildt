package yandrLearning.shildtTasks.part7.finalKW;

public class TestFinalMethod {
    public static void main(String[] args) {
        B b = new B();
        b.foo();
        b.foo("overriding foo()");
    }
}

class A {
    final void foo() {
        System.out.println("foo is final method");
    }
}

class B extends A {
    //    void foo(){} error method foo() is final
    void foo(String msg) {
        System.out.println(msg);
    }
}
