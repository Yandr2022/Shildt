package yandrLearning.shildtTasks.part12.tasks;

public class ShowEnum {
    public static void main(String[] args) {
        for (Tools t : Tools.values()) {
            System.out.println(t.ordinal() + ": " + t);
        }
    }
}

enum Tools {
    SCREWDRIVER, WRENCH, НАММЕR, PLIERS
}