package yandrLearning.shildtTasks.part6.constructorOverloading;

public class MyClass {
    int x;

    public MyClass() {
        x = 0;
        System.out.println("MyClass()");
    }

    public MyClass(int x) {
        this.x = x;
        System.out.println("MyClass(int x)");
    }

    public MyClass(double x) {
        this.x = (int) x;
        System.out.println("MyClass(double x)");
    }

    public MyClass(int x, int y) {
        this.x = x * y;
        System.out.println("MyClass(int x,int y)");
    }
}

class MyClassTest {
    public static void main(String[] args) {
        MyClass aClass = new MyClass();
        System.out.println(aClass.x);
        MyClass bClass = new MyClass(10);
        System.out.println(bClass.x);
        MyClass cClass = new MyClass(17.23);
        System.out.println(cClass.x);
        MyClass dClass = new MyClass(17, 10);
        System.out.println(dClass.x);
    }
}