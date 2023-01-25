package yandrLearning.shildtTasks.part14;

public class UseLambdaTest {
    public static void main(String[] args) {
        MyValue val = () -> 98.6;
        MyParamValue valParam = (n) -> 1.0 / n;
        System.out.println("val = " + val.getValue());
        System.out.println("valParam(4) = " + valParam.getValue(4));
        System.out.println("valParam(8) = " + valParam.getValue(8));
//        val = () -> "three";
//        valParam = () -> Math.random();
    }
}

interface MyValue {
    double getValue();
}

interface MyParamValue {
    double getValue(double v);
}