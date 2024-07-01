package Day8;

import java.io.IOException;

public class ThrowsExample {

    static void method() throws IOException {
        throw new IOException();
    }

    public static void main(String[] args) {
        try {
            method();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
