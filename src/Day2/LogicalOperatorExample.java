package Day2;

public class LogicalOperatorExample {
    public static void main(String[] args) {

        int a  =5;
        int b = 10;
        int c = 50;


        System.out.println( a >b && b>c); //false
        System.out.println( a >b & b>c); // false
        System.out.println( a >b || b>c); // true
        System.out.println( a >b | b>c);  //

    }
}
