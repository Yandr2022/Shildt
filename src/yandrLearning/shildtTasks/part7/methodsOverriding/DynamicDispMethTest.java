package yandrLearning.shildtTasks.part7.methodsOverriding;

public class DynamicDispMethTest {
    public static void main(String[] args) {
        Parent[] objects = {new Parent(), new Child(), new Child1()};
        for (Parent object : objects) {
            object.foo();
        }
//        Parent parent = new Parent();
//        Child child = new Child();
//        Child1 child1 = new Child1();
//
//        Parent ob;
//
//        ob = parent;
//        ob.foo();
//
//        ob = child;
//        ob.foo();
//
//        ob = child1;
//        ob.foo();
    }
}

class Parent{
    void foo(){
        System.out.println("Parent foo ");
    }
}
class Child extends Parent{
    @Override
    void foo() {
        System.out.println("Child foo");
    }
}
class Child1 extends Parent{
    @Override
    void foo() {
        System.out.println("Child1 foo");
    }
}
