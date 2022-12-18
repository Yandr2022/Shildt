package yandrLearning.shildtTasks.part5.strings;

public class TestBuiltInMethods {
    public static void main(String[] args) {
        String str1 = "Java is internet leader";
        String str2 = new String(str1);
        String str3 = "Java strings are effective";
        System.out.println("str1 length = " + str1.length());
        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i));
        }
        String msg = str1.equals(str2) ? "str1 equals str2" : "str1 not equals str2";
        System.out.println('\n' + msg);
        msg = str1.equals(str3) ? "str1 equals str3" : "str1 not equals str3";
        System.out.println(msg);
        int compareResult = str1.compareTo(str3);
        msg = compareResult == 0 ? "length of str1 is equal to the length of str3"
                : compareResult > 0 ? "str1 is longer than str3" : "str1 is shorter than str3";
        System.out.println(msg);
        str2 = "one two three one";
        int index = str2.indexOf("one");
        System.out.println(index);
        index = str2.lastIndexOf("one");
        System.out.println(index);
        String orgString = "Java is the engine of the internet";
        String subString = orgString.substring(8, orgString.length());
        System.out.println(orgString);
        System.out.println(subString);
    }
}
