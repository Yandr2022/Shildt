package yandrLearning.shildtTasks.part6.tasks;

public class ReverseString {
    private StringBuilder builder = new StringBuilder();
    String reverseRec(String string) {
        builder.append(string.charAt(string.length() - 1));
        return string.length() == 1 ? builder + "" : reverseRec(string.substring(0, string.length() - 1));
    }

    static String reverse(String string) {
        StringBuilder builder = new StringBuilder("");
        for (int i = string.length() - 1; i >= 0; i--) {
            builder.append(string.charAt(i));
        }
        return builder + "";
    }

    static String reverse2(String string) {
        StringBuilder builder = new StringBuilder("");
        int count = string.length() ;
        for (int i = count; i > 0; i--) {
            builder.append(string.substring(i -1 , i));
        }
        return builder + "";
    }
}
class ReverseStringTest{
    public static void main(String[] args) {
        ReverseString string = new ReverseString();
        System.out.println(string.reverseRec("abc"));
        System.out.println(ReverseString.reverse("cba"));
        System.out.println(ReverseString.reverse2("cba"));
    }
}