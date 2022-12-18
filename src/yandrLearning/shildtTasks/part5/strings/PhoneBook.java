package yandrLearning.shildtTasks.part5.strings;

public class PhoneBook {
    public static void main(String[] args ) {
        int i;

        String [][]numbers = {{"Tom","555-33-22"}, {"John","666-55-11"},{"Mary","777-44-33"},{"Liz","888-22-66"}};
        if (args.length<1){
            System.out.println("Using: java PhoneBook <Name>");
        }else{
            for (i = 0; i <numbers.length ; i++) {
                if (numbers[i][0].equals(args[0])){
                    System.out.println(numbers[i][0]+": "+numbers[i][1]);
                    break;
                }
            }
if (i== numbers.length) System.out.println("Name not found");
        }
    }
}
