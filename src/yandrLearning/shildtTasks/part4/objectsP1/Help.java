package yandrLearning.shildtTasks.part4.objectsP1;

public class Help {
    void helpOn(int choice) {
        String msg = "";
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
        }
        System.out.print("\n"+ msg + "\n");
    }

    void showMenu() {
        System.out.print("\nHelp:\n1. if\n2. switch\n3. for\n4. while\n5. do-while\n6. break\n7. continue" +
                "\nselect the desired item (q - exit): ");
    }

    boolean isValid(int ch) {
        return !(ch < '1' || ch > '7' && ch != 'q');
    }
}
