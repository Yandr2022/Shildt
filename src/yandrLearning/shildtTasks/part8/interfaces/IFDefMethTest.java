package yandrLearning.shildtTasks.part8.interfaces;

public class IFDefMethTest {
    public static void main(String[] args) {
        MyIF[] IFs = {new MyIFImpl(), new MyIFImpl2()};
        for (MyIF iF : IFs) {
            System.out.println("Admin ID: " + iF.getAdminId() + ", User ID: " + iF.getUserId());
        }
    }
}

interface MyIF {
    int getUserId();

    default int getAdminId() {
        return 1;
    }
}
class MyIFImpl implements MyIF{
    @Override
    public int getUserId() {
        return 100;
    }
}
class MyIFImpl2 implements MyIF{
    @Override
    public int getUserId() {
        return 100;
    }

    @Override
    public int getAdminId() {
        return 42;
    }
}
