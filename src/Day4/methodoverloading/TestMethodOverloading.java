package Day4.methodoverloading;

public class TestMethodOverloading {
    public static void main(String[] args) {

        Adder adder = new Adder();

        int result  = adder.add(3,5);
        System.out.println(result);

       result =  adder.add(3,5,9);
        System.out.println(result);



    }
}
