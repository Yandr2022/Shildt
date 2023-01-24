package yandrLearning.shildtTasks.part13;

public class RawTypeTest {
    public static void main(String[] args) {
        RawGen<Integer> iOb = new RawGen<>(88);
        RawGen<String> sOb = new RawGen<>("Test");
        RawGen raw = new RawGen(98.6);
        double d =(Double) raw.getOb();
        System.out.println(d);
        int i = (Integer)raw.getOb();//RT error
        sOb = raw;
        String str = sOb.getOb();//RT error
        raw = iOb;
        d = (Double)raw.getOb();//RT error

    }
}
class RawGen<T>{
    T ob;

    RawGen(T ob){
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }
}
