package yandrLearning.shildtTasks.part6.staticKW;

class StaticMethDemo {
    static int val = 1024;

    static int getHalfVal() {
        return val == 0 ? 0 : val / 2;
    }

}

class StaticMethDemoTest {
    public static void main(String[] args) {
        System.out.println(StaticMethDemo.getHalfVal());
        StaticMethDemo.val = 4;
        System.out.println(StaticMethDemo.getHalfVal());
    }
}
