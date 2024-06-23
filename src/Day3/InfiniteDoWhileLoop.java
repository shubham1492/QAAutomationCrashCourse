package Day3;

public class InfiniteDoWhileLoop {
    public static void main(String[] args) {

        int i =1;
        do{
            if(i==4){
                break;
            }
            System.out.println("infinite do while loop");
            i++;
        }while (true);


    }
}
