package yandrLearning.shildtTasks.part6.methodOverloading;

class OverLoad2 {
    void f(int a) {
        System.out.println("f(int): " + a);
    }

    void f(double a) {
        System.out.println("f(double): " + a);
    }

    void f2(byte a) {
        System.out.println("f2(byte): " + a);
    }

    void f2(int a) {
        System.out.println("f2(int): " + a);
    }

    void f2(double a) {
        System.out.println("f2(double): " + a);
    }

}
class OverLoad2Test{
    public static void main(String[] args) {
        int i = 10;
        double d = 10;
        byte b = 10;
        short s = 10;
        float f = 10F;

        OverLoad2 load2 = new OverLoad2();

        load2.f(i);
        load2.f(d);
        load2.f(b);
        load2.f(s);
        load2.f(f);
        System.out.println("******************");
        load2.f2(i);
        load2.f2(d);
        load2.f2(b);
        load2.f2(s);
        load2.f2(f);

    }
}
