package yandrLearning.shildtTasks.part13;

import static yandrLearning.shildtTasks.part13.LimitedWildCard.*;


public class LimitedWildCardTest {
    public static void main(String[] args) {
        Gen<A> aGen = new Gen<>(new A());
        Gen<B> bGen = new Gen<>(new B());
        Gen<C> cGen = new Gen<>(new C());
        Gen<D> dGen = new Gen<>(new D());
        test(aGen);
        test(bGen);
        test(cGen);
//        test(dGen);

        test2(aGen);
        test2(bGen);
//        test2(cGen);
//        test2(dGen);
    }
}
class LimitedWildCard {
    static void test(Gen<? extends A> o){}
    static void test2(Gen<? super B> o){}
}

class Gen<T> {
    T оb;

    public Gen(T оb) {
        this.оb = оb;
    }
}


class A {
}

class B extends A {
}

class C extends B {
}

class D {
}