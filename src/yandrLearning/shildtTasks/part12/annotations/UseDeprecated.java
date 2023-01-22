package yandrLearning.shildtTasks.part12.annotations;

public class UseDeprecated {
    public static void main(String[] args) {
        MyClass myClass = new MyClass("Test");
        System.out.println(myClass.getName());
    }
}

@Deprecated
class MyClass {
    private String name;

    public MyClass(String name) {
        this.name = name;
    }

    @Deprecated
    public String getName() {
        return name;
    }
}