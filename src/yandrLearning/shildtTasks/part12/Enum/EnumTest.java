package yandrLearning.shildtTasks.part12.Enum;

public class EnumTest {
    public static void main(String[] args) {
Transport tp =Transport.AIRPLANE;
        System.out.println("tp = "+tp);
        tp = Transport.TRAIN;
        if (tp == Transport.TRAIN) System.out.println("tp contains TRAIN");
for (Transport tr:Transport.values()) {
    switch (tr) {
        case CAR:
            System.out.println("car carries people");
            break;
        case TRACK:
            System.out.println("truck transporting people");
            break;
        case BOAT:
            System.out.println("boat floats on the river");
            break;
        case AIRPLANE:
            System.out.println("airplane flies");
            break;
        case TRAIN:
            System.out.println("train moving on rails");
            break;
    }
}
    }
}
