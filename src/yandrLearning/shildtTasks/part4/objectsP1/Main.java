package yandrLearning.shildtTasks.part4.objectsP1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Pwr pwr = new Pwr(2.5,5);
        Pwr pwr1 = new Pwr(3,3);
        Pwr pwr2 = new Pwr(4,2);
        System.out.println("pwr = "+pwr.getPwr()+"\npwr1 = "+pwr1.getPwr()+"\npwr2 = "+pwr2.getPwr());

//        Vehicle minivan = new Vehicle(7,16,21);
//        Vehicle sportCar = new Vehicle(2,14,12);
//        int distance = 252;
//
//        System.out.println("Minivan can carry " + minivan.passengers + " passengers for "
//                + minivan.calcRange() + " miles without refueling");
//        System.out.println("Van needs " + minivan.fuelNeeded(distance) + " gallons of fuel to cover " + distance + " miles");
//        System.out.println("Sport car can carry " + sportCar.passengers + " passengers for "
//                + sportCar.calcRange() + " miles without refueling");
//        System.out.println("Sport car needs " + sportCar.fuelNeeded(distance) + " gallons of fuel to cover " + distance + " miles");
//        char ch, ignore;
//        Help help = new Help();
//        for (; ; ) {
//            do {
//                help.showMenu();
//                ch = (char) System.in.read();
//                do {
//                    ignore = (char) System.in.read();
//                } while (ignore != '\n');
//            } while (!help.isValid(ch));
//            if (ch == 'q') {
//                break;
//            }
//            help.helpOn(ch);
//        }
    }
}
