package yandrLearning.shildtTasks.part6.methodOverloading;

class OverLoad {

    void ovlDemo() {
        System.out.println("Without arguments");
    }

    void ovlDemo(int a) {
        System.out.println("With one argument: " + a);
    }

    int ovlDemo(int a, int b) {
        System.out.println("With two argument: " + a + " " + b);
        return a + b;
    }

    double ovlDemo(double a, double b) {
        System.out.println("With two argument: " + a + b);
        return a + b;
    }

}

class OverLoadTest {
    public static void main(String[] args) {
        OverLoad load = new OverLoad();
        int resI;
        double resD;


        load.ovlDemo();
        load.ovlDemo(2);
        resI = load.ovlDemo(4, 6);
        System.out.println("Integer result: " + resI);
        resD = load.ovlDemo(4,6);
        System.out.println("IDouble result: " + resD);

    }
}
