package yandrLearning.shildtTasks.part6.staticKW;

class StaticVarDemo {
    static int x;
    int y;

    public StaticVarDemo(int y) {
        this.y = y;
    }

    int sum() {
        return x + y;
    }
}

class StaticVarDemoTest {
    public static void main(String[] args) {
        StaticVarDemo demo = new StaticVarDemo(10);
        StaticVarDemo demo1 = new StaticVarDemo(20);
        StaticVarDemo.x = 19;
        System.out.println("static x = " + StaticVarDemo.x + "\ndemo.y = " + demo.y
                + ", demo.sum() = " + demo.sum() + "\ndemo1.y = " + demo1.y
                + ", demo1.sum() = " + demo1.sum());
        StaticVarDemo.x = 100;
        System.out.println("static x = " + StaticVarDemo.x + "\ndemo.y = " + demo.y
                + ", demo.sum() = " + demo.sum() + "\ndemo1.y = " + demo1.y
                + ", demo1.sum() = " + demo1.sum());

    }
}
