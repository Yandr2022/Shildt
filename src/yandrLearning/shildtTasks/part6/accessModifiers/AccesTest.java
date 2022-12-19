package yandrLearning.shildtTasks.part6.accessModifiers;

public class AccesTest {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.setAlpha(-99);
        System.out.println("alpha = " + myClass.getAlpha());
        //myClass.alpha = 10;- error,because access modifier is private
        myClass.beta = 88;
        myClass.gamma = 77;
        System.out.println("beta = " + myClass.beta + "\ngamma = " + myClass.gamma);
    }
}
