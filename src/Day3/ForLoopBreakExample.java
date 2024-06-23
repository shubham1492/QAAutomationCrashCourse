package Day3;

public class ForLoopBreakExample {
    public static void main(String[] args) {

        for(int i=1;i<=10;i++){
            if(i==8){
                break;
            }
            System.out.println(i);
        }

        System.out.println("rest of the code");

    }
}
