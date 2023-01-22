package yandrLearning.shildtTasks.part12.AutoBoxing;

public class AytoBoxTest {
    public static void main(String[] args) {
        Integer iObj, iObj1;
        int i;
        iObj = 99;
        System.out.println("Start value iObj: " + iObj);
        ++iObj;
        System.out.println("++iObj: " + iObj);
        iObj += 10;
        System.out.println("iObj +=10: " + iObj);
        iObj1 = iObj + (iObj / 3);
        System.out.println("iObj1 = iObj + (iObj / 3): " + iObj1);
        i = iObj + (iObj / 3);
        System.out.println("i = iObj + (iObj / 3): " + i);

        iObj = 2;
        switch (iObj) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("Different 1-3 number");
                break;
        }

    }
}
