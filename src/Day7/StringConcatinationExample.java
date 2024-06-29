package Day7;

public class StringConcatinationExample {

    public static void main(String[] args) {

        String s = "sachin" + " tendulkar" + " is playing for india";

        System.out.println(s);

        String s1 = "Sachin";
        String s2= "Tendulkar";
        String s4 = s1 + s2;
        String s3  = s1.concat(s2);

        System.out.println(s3);
        System.out.println(s4);

    }
}
