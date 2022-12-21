package yandrLearning.shildtTasks.part6.passObjectsToMethods;

public class TestBlock {
    public static void main(String[] args) {
        Block block = new Block(10,2,5);
        Block block2 = new Block(10,2,5);
        Block block3 = new Block(4,5,5);
        System.out.println("block1 has the same dimensions as block2: "+ block.sameBlock(block2));
        System.out.println("block1 has the same dimensions as block3: "+ block.sameBlock(block3));
        System.out.println("block2 has the same volume as block3: "+ block2.sameVolume(block3));
    }
}
