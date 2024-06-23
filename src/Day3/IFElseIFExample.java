package Day3;

import java.util.Scanner;

public class IFElseIFExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks");
        int marks = sc.nextInt();

        if(marks<50){
            System.out.println("fail");
        } else if (marks>=50 && marks<60) {
            System.out.println("D grade");
        } else if (marks>=60 && marks<70) {
            System.out.println("C grade");
        } else if (marks>=70 && marks<80) {
            System.out.println("B Grade");
        }else if(marks>=80 && marks<100){
            System.out.println("A Grade");
        }else{
            System.out.println("invalid input,Please check");
        }


    }
}
