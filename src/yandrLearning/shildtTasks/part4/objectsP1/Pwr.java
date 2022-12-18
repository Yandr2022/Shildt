package yandrLearning.shildtTasks.part4.objectsP1;

public class Pwr {
    double base;
    int exp;
    double value;

     Pwr(double base, int exp) {
        this.base = base;
        this.exp = exp;
        value = 1;
        if (exp == 0) return;
        for (; exp > 0; exp--) {
            value = base * value;
        }
    }
    double getPwr(){
         return  value;
    }
}
