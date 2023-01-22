package yandrLearning.shildtTasks.part12.Enum;

public class EnumTest2 {
    public static void main(String[] args) {
        Transport[] allTr = Transport.values();
        for (Transport tr : allTr) System.out.println(tr);
        System.out.println();
        Transport tp = Transport.valueOf("AIRPLANE");
        System.out.println(tp);

    }
}
