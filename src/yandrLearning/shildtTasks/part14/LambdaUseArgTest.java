package yandrLearning.shildtTasks.part14;

public class LambdaUseArgTest {
    static String changeString(StringFunc func, String str) {
        return func.func(str);
    }

    public static void main(String[] args) {
        String inStr = "Lambda Expressions expand Java";

        StringFunc reverse = (str) -> {
            StringBuilder builder = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                builder.append(str.charAt(i));
            }
            return builder + "";
        };
        StringFunc remove = (str) -> {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ')
                    builder.append(str.charAt(i));
            }
            return builder + "";
        };

        System.out.println(String.format("reverse '%s': '%s'", inStr, changeString(reverse, inStr)));

        System.out.println(String.format("'%s' with removed spaces: '%s'", inStr, changeString(remove, inStr)));

        System.out.println(String.format("'%s' with exchange spaces: '%s'"
                , inStr, changeString((str) -> str.replace(" ", "-"), inStr)));

        System.out.println(String.format("'%s' with exchange Register letters: '%s'"
                , inStr, changeString((str) -> {
                    StringBuilder builder = new StringBuilder();
                    char c;
                    for (int i = 0; i < str.length(); i++) {
                        c = str.charAt(i);
                        builder.append(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
                    }
                    return builder + "";
                }, inStr)));
    }
}

interface StringFunc {
    String func(String str);
}