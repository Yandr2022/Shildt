package yandrLearning.shildtTasks.part6.passObjectsToMethods;

public class Block {
    int a, b, c, volume;

    public Block(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.volume = this.a * this.b * this.c;
    }

    boolean sameBlock(Block block) {
        return block.a == a && block.b == b && block.c == c;
    }

    boolean sameVolume(Block block){
        return block.volume == volume;
    }
}
