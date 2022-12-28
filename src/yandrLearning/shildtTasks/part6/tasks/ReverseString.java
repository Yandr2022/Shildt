package yandrLearning.shildtTasks.part6.tasks;

public class ReverseString {
    static String reverseRec(String string) {
        StringBuilder builder = new StringBuilder("");
        int count = string.length();
        builder.append(string.charAt(count - 1));
        if (count == 0) return builder.append(string.charAt(count)) + "";
        else
            return reverseRec(string.substring(count - 1, count));
    }
    static String reverse(String string){
        StringBuilder builder = new StringBuilder("");
        int count = string.length()-1;
        for (int i = count; i >=0 ; i--) {
            builder.append(string.charAt(count--));
        }
        return builder+"";
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
        System.out.println(ReverseString.reverseRec("abc"));
    }
}