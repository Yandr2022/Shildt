package yandrLearning.shildtTasks.part6.staticKW;

class StaticInitBlockDemo {
    static double rootOf2;
    static double rootOf3;
    double sum;

    {
        sum = rootOf2 + rootOf3;
        System.out.println("init block");
        System.out.println(sum);
    }

    static {
        rootOf2 = Math.sqrt(2);
        rootOf3 = Math.sqrt(3);
        System.out.println("static init block");
        System.out.println(rootOf2);
        System.out.println(rootOf3);
    }

    public StaticInitBlockDemo(String msg) {
        System.out.println(msg);
    }
}

 class StaticInitBlockDemoTest {
     public static void main(String[] args) {
StaticInitBlockDemo demo = new StaticInitBlockDemo("constructor");
     }
}


