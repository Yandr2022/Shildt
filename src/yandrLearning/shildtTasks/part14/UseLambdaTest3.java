package yandrLearning.shildtTasks.part14;

public class UseLambdaTest3 {
    public static void main(String[] args) {
        StringTest isIn = (a, b) -> a.indexOf(b) != -1;
        String strA = "This is Test";
        String strB = "is";
        System.out.println(isIn.test(strA, strB) ? String.format("%s is found in the %s", strB, strA)
                : String.format("%s is not found in the %s", strB, strA));
        strB = "xyz";
        System.out.println(isIn.test(strA, strB) ? String.format("%s is found in the %s", strB, strA)
                : String.format("%s is not found in the %s", strB, strA));
    }
}

interface StringTest {
    boolean test(String aStr, String bStr);
}