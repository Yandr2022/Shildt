package yandrLearning.shildtTasks.part4.objectsP1;

public class Vehicle {
    int passengers;
    int fuelCap;
    int mpg;

    public Vehicle(int passengers, int fuelCap, int mpg) {
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.mpg = mpg;
    }

    int calcRange() {
        return fuelCap * mpg;
    }

    double fuelNeeded(int milesNum) {
        return (double) milesNum / mpg;
    }
}
