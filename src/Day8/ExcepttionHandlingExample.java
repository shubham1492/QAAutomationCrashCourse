package Day8;

public class ExcepttionHandlingExample {

    public static void main(String[] args) {

        try {
            int result = 100 / 0;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println(e);
        }

        System.out.println("rest of the code");

    }
}
