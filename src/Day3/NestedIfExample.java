package Day3;

public class NestedIfExample {
    public static void main(String[] args) {

        int age = 20;
        int weight = 50;

        if(age>18){
            if(weight>60){
                System.out.println("you are eligible to donate the blood");
            }else{
                System.out.println("you are not eligible");
            }
        }else{
            System.out.println("Please input th ecorrect age, age must be grater then 18");
        }
    }
}
