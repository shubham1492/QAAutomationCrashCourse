package Day8;

import javax.naming.PartialResultException;
import java.lang.invoke.VarHandle;

public class ThrowExample {

    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("Person is not eligible ");
        }else{
            System.out.println("person is eligible yo vote");
        }
    }
    public static void main(String[] args) {
       try {
           validate(13);
       }catch (Exception e){
           System.out.println(e);
       }

        System.out.println("rest of the code");
    }
}
