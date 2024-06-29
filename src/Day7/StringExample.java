package Day7;

public class StringExample {
    public static void main(String[] args) {

        char ch[] = {'h','e','l','l','o'};

        String s1 = new String(ch);

        String s2 = "welcome"; // 1
        String s3 = new String("Welcome"); // 1

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
