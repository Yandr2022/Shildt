package yandrLearning.shildtTasks.part12.Enum;

public class EnumObjTest {
    public static void main(String[] args) {
        System.out.println("Airplaine speed = "+Transports.AIRPLANE.getSpeed()+" 80 km/h");

        for (Transports tp:Transports.values()) System.out.println(
                String.format("speed of %s = %d km/h",tp,tp.getSpeed()));
    }
}
