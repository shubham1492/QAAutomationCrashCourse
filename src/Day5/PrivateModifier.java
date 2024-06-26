package Day5;

public class PrivateModifier {

    private int data = 40;

    private void msg(){
        System.out.println("Hello Java");
    }

    public static void main(String[] args) {
        PrivateModifier p1 = new PrivateModifier();
        p1.msg();

    }
}
