package Day7;

public class StringBufferExample {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");

        sb.append(" World");

        System.out.println(sb);

        sb.insert(1,"hello");

        System.out.println(sb);

        sb.replace(1,6,"india");

        System.out.println(sb);

        sb.reverse();

        System.out.println(sb);

    }
}
