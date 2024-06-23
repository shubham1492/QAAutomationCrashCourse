package Day2;

public class ArithmeticOperatorExample {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println(a+b); //  30
        System.out.println(a-b); //   -10
        System.out.println(a*b); //   200
        System.out.println(a/b); //   0
        System.out.println(a%b); //  0

        System.out.println(a++); // 10
        System.out.println(++a); //  12
        a++;
        System.out.println(b--); // 20
        System.out.println(++a); //
        System.out.println(--b); //

        System.out.println(++a + b++ + --a + b--); //
        System.out.println(--a + a++ + b-- + ++a + a + --b); //  13 + 13 + 18 + 15 + 15 + 16



    }

}
