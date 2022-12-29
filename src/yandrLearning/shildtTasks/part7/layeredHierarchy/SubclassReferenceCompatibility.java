package yandrLearning.shildtTasks.part7.layeredHierarchy;

public class SubclassReferenceCompatibility {
    public static void main(String[] args) {
        Z z = new Z(10);
        Z z2;
        W w = new W(5, 15);
        z2 = z;
        System.out.println("z2.a = " + z2.a);
        z2 = w;
        System.out.println("z2.a = " + z2.a);
        z2.a =8;
        System.out.println("z2.a = " + z2.a);
//        z2.b = 6; error: reference of type Z does not have variable b

    }
}
class Z{
    int a;

    public Z(int a) {
        this.a = a;
    }
}
class W extends Z{
    int b;

    public W(int b, int a) {
        super(a);
        this.b = b;
    }
}