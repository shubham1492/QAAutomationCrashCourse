package Day8;

public class NestedTryCatchBlock {
    public static void main(String[] args) {

        try{
            try {
                int data = 50 / 0;
            }catch(ArithmeticException e){
                System.out.println(e);
            }
            try {
                int arr[] = new int[5];
                arr[6] = 50;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }catch(Exception e){
            System.out.println(e);
        }


    }
}
