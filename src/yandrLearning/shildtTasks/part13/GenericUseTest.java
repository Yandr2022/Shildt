package yandrLearning.shildtTasks.part13;

public class GenericUseTest {
    public static void main(String[] args) {
        GenDemo<Integer> demoInt = new GenDemo(88);
        demoInt.showType();
        int val = demoInt.getOb();
        System.out.println(val + "\n");

        GenDemo<String> demoStr;
        demoStr= new GenDemo("abc");
        demoStr.showType();
        String valStr = demoStr.getOb();
        System.out.println(valStr);

    }
}

class GenDemo<T> {
    T ob;

    GenDemo(T ob) {
        this.ob = ob;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println(ob.getClass().getName());
    }
}
