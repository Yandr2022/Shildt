package yandrLearning.shildtTasks.part3.controlInstructions;


import java.io.IOException;
import java.util.Scanner;

public class TeSt {
    public static void main(String[] args) throws IOException {
//        a();
//        equalsQ();
////        guess4();
//        help2();
//        breakWithLabel3();
//        continueEvenNum();
//        continueOuterLoop();
//        help3();
        nestedLoopDiv();

    }

    public static void a() {
        int e, res;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                res = 1;
                e = i;
                while (e > 0) {
                    res *= j;
                    e--;
                }
                System.out.println(j + " of " + i + " = " + res);
            }
        }

    }

    public static void equalsQ() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String ch;
        do {
            System.out.print("Enter letter:");
            ch = scanner.nextLine().toLowerCase();
        } while (!ch.equals("q"));
        scanner.close();
    }

    public static void guess4() throws IOException {
        char ch, ignore, answer = 'K';
        do {
            System.out.println("try to guess a letter from A to Z");
            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (ch == answer) {
                System.out.println("Right");
            } else {
                System.out.print("the correct letter is closer");
                if (ch < answer) {
                    System.out.println(" to the end of the alphabet");
                } else {
                    System.out.println(" to the start of the alphabet");
                }
                System.out.println("Try again\n");
            }
        } while (ch != answer);


    }


    public static void help2() throws IOException {
        char choice, ignore;
        String msg = "";
        do {
            System.out.print("Help:\n1. if\n2. switch\n3. for\n4. while\n5. do-while\nselect the desired item: ");
            choice = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

        } while (choice < '1' || choice > '5');
        switch (choice) {
            case '1':
                msg = "if (condition){ instruction;}\nelse { instruction; }";
                break;
            case '2':
                msg = "switch(expression){\ncase constant: instruction;[break;]\n...[default: instruction; [break;]]}";
                break;
            case '3':
                msg = "for(initialization;expression;iteration){\ninstruction }";
                break;
            case '4':
                msg = "while (condition){\ninstruction;}";
                break;
            case '5':
                msg = "do{\ninstruction;\n}while(condition);";
                break;
        }
        System.out.print(msg);

    }

    public static void breakWithLabel() {
        for (int i = 1; i < 4; i++) {
            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("\ni = " + i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;
                        System.out.println("you never see this msg ");

                    }
                    System.out.println("after three");

                }
                System.out.println("after two");

            }
            System.out.println("after one");
        }
        System.out.println("after for");
    }

    public static void breakWithLabel2() {
        done:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(k);
                    if (k == 5) break done;
                }
                System.out.println("after loop 'k'");
            }
            System.out.println("after loop 'j'");
        }
        System.out.println("after loop 'i'");
    }

    public static void breakWithLabel3() {
        stop1:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 2) break stop1;
                System.out.println("i = " + i + " j = " + j + "");
            }
        }
        System.out.println();
        for (int i = 0; i < 5; i++)
            stop1:{
                for (int j = 0; j < 5; j++) {
                    if (j == 2) break stop1;
                    System.out.println("i = " + i + " j = " + j + "");
                }
            }
    }

    public static void continueEvenNum() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) continue;
            System.out.println("i = " + i);
        }
    }

    public static void continueOuterLoop() {
        outloop:
        for (int i = 0; i < 10; i++) {
            System.out.print("\nOuter loop: " + i + " inner loop: ");
            for (int j = 0; j < 10; j++) {
                if (j == 5) continue outloop;
                System.out.print(j);
            }
        }
    }
    public static void help3() throws IOException {
        char choice, ignore;
        String msg = "";
        stop:for (;;) {
            do {
                System.out.print("\nHelp:\n1. if\n2. switch\n3. for\n4. while\n5. do-while\n6. break\n7. continue" +
                        "\nselect the desired item (q - exit): ");
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

            } while (choice < '1' || choice > '7' && choice != 'q');
            System.out.println();

            switch (choice) {
                case '1':
                    msg = "if (condition){ instruction;}\nelse { instruction; }";
                    break;
                case '2':
                    msg = "switch(expression){\ncase constant: instruction;[break;]\n...[default: instruction; [break;]]}";
                    break;
                case '3':
                    msg = "for(initialization;expression;iteration){\ninstruction }";
                    break;
                case '4':
                    msg = "while (condition){\ninstruction;}";
                    break;
                case '5':
                    msg = "do{\ninstruction;\n}while(condition);";
                    break;
                case '6':
                    msg = "break;\nbreak label;";
                    break;
                case '7':
                    msg = "continue;\ncontinue label;";
                    break;
                case 'q':
                    break stop;
            }
            System.out.print(msg+"\n");
        }

    }

    public static void nestedLoopDiv() {
        int i, j, half;
        for (i = 2; i < 100; i++) {
            System.out.print("Divisors " + i + ": ");
            for (j = 2, half = i/2; j <= half; j++) {
                if ((i % j) == 0)
                    System.out.print(j + " ");
            }
            System.out.println();

        }

    }
}









