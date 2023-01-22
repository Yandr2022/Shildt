package yandrLearning.shildtTasks.part12.Enum;

enum Transports {
    CAR(100), TRACK(80), AIRPLANE(900), TRAIN(120), BOAT(35);

    private final int speed;

    Transports(int speed) {
        this.speed = speed;
    }

    int getSpeed() {
        return speed;
    }
}
