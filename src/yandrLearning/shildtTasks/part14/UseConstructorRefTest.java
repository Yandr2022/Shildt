package yandrLearning.shildtTasks.part14;

public class UseConstructorRefTest {
    public static void main(String[] args) {
        MyIF miClassCons = MiClass::new;
        MyArrIF miClassArr = MiClass[]::new;
        MiClass miClass = miClassCons.func("Test");
        MiClass[] miArrClass = miClassArr.func(3);
        for (int i = 0; i < 3; i++) {
            miArrClass[i] = new MiClass();
        }
        System.out.println("str to miClass: " + miClass.getStr());
        for (MiClass miCl: miArrClass
             ) {
            System.out.println(miCl.getStr());
        }
    }
}

interface MyIF {
    MiClass func(String s);
//    MiClass func();

}
interface MyArrIF {
    MiClass[] func(int n);

}

class MiClass {
    private String str;

    public MiClass(String str) {
        this.str = str;
    }

    public MiClass() {
        str = "Default";
    }

    public String getStr() {
        return str;
    }
}
