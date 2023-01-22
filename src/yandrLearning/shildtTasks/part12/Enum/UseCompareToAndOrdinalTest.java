package yandrLearning.shildtTasks.part12.Enum;

public class UseCompareToAndOrdinalTest {
    public static void main(String[] args) {
        Transports t, tp, tpp;
        for (Transports tps : Transports.values()) {
            System.out.println(tps + " : " + tps.ordinal());
        }
        t = Transports.AIRPLANE;
        tp = Transports.TRAIN;
        tpp = Transports.AIRPLANE;
        int res = t.compareTo(tp);
        System.out.println(res > 0 ? String.format("ordinal %s greater than ordinal %s", t, tp)
                : res < 0 ? String.format("ordinal %s less than ordinal %s", t, tp)
                : String.format("ordinal %s equals ordinal %s", t, tp));
        res = t.compareTo(tpp);
        System.out.println(res > 0 ? String.format("ordinal %s greater than ordinal %s", t, tpp)
                : res < 0 ? String.format("ordinal %s less than ordinal %s", t, tpp)
                : String.format("ordinal %s equals ordinal %s", t, tpp));
    }

}
