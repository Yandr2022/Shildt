package yandrLearning.shildtTasks.part14;

public class UseLambdaTest2 {
    public static void main(String[] args) {
        Numeric[] numerics = {(n, d) -> (n % d) == 0, (n, d) -> n < d, (n, d) -> (n < 0 ? -n : n) == (d < 0 ? -d : d)};
        String[] msgs = {"2 is factor 4= " + numerics[0].test(4, 2), "4 is factor 10= " + numerics[0].test(10, 4)
                , (numerics[1].test(10, 5) ? "10 < 5" : "10 > 5"), (numerics[1].test(2, 3) ? "2 < 3" : "2 > 3")
                , (numerics[2].test(2, 5) ? "2 = 5" : "2 != 5"), (numerics[2].test(5, 5) ? "5 = 5" : "5 != 5")};
        for (String msg : msgs) {
            System.out.println(msg);
        }
    }
}

interface Numeric {
    boolean test(int n, int m);
}