package yandrLearning.shildtTasks.part7.inheritance;

public class TruckDemo {
    public static void main(String[] args) {
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        int distance = 252;
        System.out.println("The truck can transport " + semi.getCargoCap() + " pounds and " + semi.getPassengers()
                + " passengers");
        System.out.println("Truck will need " + semi.fuelNeeded(distance) + " gallons of fuel to cover " + distance + " miles");
        System.out.println("The pickup can transport " + pickup.getCargoCap() + " pounds and " + pickup.getPassengers()
                + " passengers");
        System.out.println("Pickup will need " + pickup.fuelNeeded(distance) + " gallons of fuel to cover " + distance + " miles");
    }
}

 class Vehicle {
    private int passengers;
    private int fuelCap;
    private int mpg;


    public Vehicle(int passengers, int fuelCap, int mpg) {
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.mpg = mpg;
    }

     public int getPassengers() {
         return passengers;
     }

     public void setPassengers(int passengers) {
         this.passengers = passengers;
     }

     public int getFuelCap() {
         return fuelCap;
     }

     public void setFuelCap(int fuelCap) {
         this.fuelCap = fuelCap;
     }

     public int getMpg() {
         return mpg;
     }

     public void setMpg(int mpg) {
         this.mpg = mpg;
     }

     int calcRange() {
        return fuelCap * mpg;
    }

    double fuelNeeded(int milesNum) {
        return (double) milesNum / mpg;
    }
}
class Truck extends Vehicle{
   private int cargoCap;

    public Truck(int passengers, int fuelCap, int mpg, int cargoCap) {
        super(passengers, fuelCap, mpg);
        this.cargoCap = cargoCap;
    }

    public int getCargoCap() {
        return cargoCap;
    }

    public void setCargoCap(int cargoCap) {
        this.cargoCap = cargoCap;
    }
}