package yandrLearning.shildtTasks.part6.passObjectsToMethods;

 class Block {
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
class BlockTest {
    public static void main(String[] args) {
        Block block = new Block(10,2,5);
        Block block2 = new Block(10,2,5);
        Block block3 = new Block(4,5,5);
        System.out.println("block1 has the same dimensions as block2: "+ block.sameBlock(block2));
        System.out.println("block1 has the same dimensions as block3: "+ block.sameBlock(block3));
        System.out.println("block2 has the same volume as block3: "+ block2.sameVolume(block3));
    }
}

