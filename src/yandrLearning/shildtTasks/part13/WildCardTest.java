package yandrLearning.shildtTasks.part13;

public class WildCardTest {
    public static void main(String[] args) {
        Numeric_Fns<Integer> iOb = new Numeric_Fns<>(6);
        Numeric_Fns<Double> dOb = new Numeric_Fns<>(-6.0);
        Numeric_Fns<Long> lOb = new Numeric_Fns<>(6L);
        System.out.println(iOb.absEqual(dOb));
        System.out.println(iOb.absEqual(lOb));
        System.out.println(lOb.absEqual(dOb));
    }
}

class Numeric_Fns<T extends Number> {
    private T num;

    public T getNum() {
        return num;
    }

    public Numeric_Fns(T num) {
        this.num = num;
    }

    double reciprocal() {
        return 1 / num.doubleValue();
    }

    double fraction() {
        return num.doubleValue() - num.intValue();
    }

    boolean absEqual(Numeric_Fns<?> ob) {
        return Math.abs(num.doubleValue()) == Math.abs(ob.getNum().doubleValue());
    }
}