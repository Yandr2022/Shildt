package yandrLearning.shildtTasks.part2;

/*Упражнение 2.2
Отображение таблицы истинности для логических операторов значениями 0 и 1*/
public class LogicalOpTableInt {
    public static void main(String[] args) {
        WithFor();
        boolean p, q;
        int x, y;
        int res1, res2, res3, res4;
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        p = q = true;
        x = p ? 1 : 0;
        y = q ? 1 : 0;
        res1 = p & q ? 1 : 0;
        res2 = p | q ? 1 : 0;
        res3 = p ^ q ? 1 : 0;
        res4 = !p ? 1 : 0;
        System.out.print(x + "\t" + y + "\t");
        System.out.print(res1 + "\t" + res2 + "\t");
        System.out.println(res3 + "\t" + res4);
        p = true;
        q = false;
        x = p ? 1 : 0;
        y = q ? 1 : 0;
        res1 = p & q ? 1 : 0;
        res2 = p | q ? 1 : 0;
        res3 = p ^ q ? 1 : 0;
        res4 = !p ? 1 : 0;
        System.out.print(x + "\t" + y + "\t");
        System.out.print(res1 + "\t" + res2 + "\t");
        System.out.println(res3 + "\t" + res4);
        p = false;
        q = true;
        x = p ? 1 : 0;
        y = q ? 1 : 0;
        res1 = p & q ? 1 : 0;
        res2 = p | q ? 1 : 0;
        res3 = p ^ q ? 1 : 0;
        res4 = !p ? 1 : 0;
        System.out.print(x + "\t" + y + "\t");
        System.out.print(res1 + "\t" + res2 + "\t");
        System.out.println(res3 + "\t" + res4);
        p = q = false;
        x = p ? 1 : 0;
        y = q ? 1 : 0;
        res1 = p & q ? 1 : 0;
        res2 = p | q ? 1 : 0;
        res3 = p ^ q ? 1 : 0;
        res4 = !p ? 1 : 0;
        System.out.print(x + "\t" + y + "\t");
        System.out.print(res1 + "\t" + res2 + "\t");
        System.out.println(res3 + "\t" + res4);
    }

    public static void WithFor() {
        boolean p, q;
        int x, y;
        int res1, res2, res3, res4;
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        boolean[] values = {true, true, true, false, false, true, false, false};
        for (int i = 0; i < values.length - 1; i++) {
            p = values[i];
            q = values[++i];
            x = p ? 1 : 0;
            y = q ? 1 : 0;
            res1 = p & q ? 1 : 0;
            res2 = p | q ? 1 : 0;
            res3 = p ^ q ? 1 : 0;
            res4 = !p ? 1 : 0;
            System.out.print(x + "\t" + y + "\t");
            System.out.print(res1 + "\t" + res2 + "\t");
            System.out.println(res3 + "\t" + res4);

        }

    }
}
