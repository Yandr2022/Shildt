package yandrLearning.shildtTasks.part13;

public class LimitedParameterizedTypesTest {
    public static void main(String[] args) {

NumericFns<Integer> iOb = new NumericFns<>(5);
        System.out.println(String.format("for %d\nreciprocal = %.2f, fraction = %.2f"
                ,iOb.getNum(),iOb.reciprocal(),iOb.fraction()));
NumericFns<Double> dOb = new NumericFns<>(5.25);
        System.out.println(String.format("for %.2f\nreciprocal = %.2f, fraction = %.2f"
                ,dOb.getNum(),dOb.reciprocal(),dOb.fraction()));
//        NumericFns<String> sOb = new NumericFns<>("5.25");
    }
}

class NumericFns<T extends Number> {
   private T num;

    public T getNum() {
        return num;
    }

    public NumericFns(T num) {
        this.num = num;
    }

    double reciprocal() {
        return 1 / num.doubleValue();
    }

    double fraction() {
        return num.doubleValue() - num.intValue();
    }
}
