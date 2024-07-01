package Day8;

public class FInallyBlockExample {

    public static void main(String[] args) {
        try {
            int data = 40 / 5;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("its always executed");

        }
        System.out.println("Rest of the code");
    }
}
