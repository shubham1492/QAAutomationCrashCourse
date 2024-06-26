package Day5.statickeyword;

public class StaticBlock {

    static int data;

    static {
        data = 40;
        System.out.println("staic block is invocked");
    }

    public static void main(String[] args) {

        System.out.println("main method");
        System.out.println(StaticBlock.data);
    }
}
