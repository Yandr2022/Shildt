package yandrLearning.shildtTasks.part6.passObjectsToMethods;

 class Test {
    void noChangeArguments(int i, int j) {
        i += j;
        j = -j;
    }
}
class Test2{
     int i,j;

    public Test2(int i, int j) {
        this.i = i;
        this.j = j;
    }
    void changeArguments(Test2 obj){
        obj.i += obj.j;
        obj.j = -obj.j;
    }
}

class CallByValue {
    public static void main(String[] args) {
        Test test = new Test();
        int a = 20, b = 15;
        System.out.println("value before call:\na = " + a + " b = " + b);
        test.noChangeArguments(a, b);
        System.out.println("value after call:\na = " + a + " b = " + b);
    }
}

    class CallByRef {
    public static void main(String[] args) {
        Test2 test = new Test2(15,20);
        System.out.println("value before call:\ni = " + test.i + " j = " + test.j);
        test.changeArguments(test);
        System.out.println("value after call:\ni = " + test.i + " j = " + test.j);
    }
}
