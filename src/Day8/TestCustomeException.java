package Day8;

public class TestCustomeException {

    public static void validate(int age){
        if(age<18){
            throw new InvalidAgeException("age not a valid to vote");
        }
    }

    public static void main(String[] args) {
        try {
            validate(12);
        }catch (InvalidAgeException e){
            System.out.println(e);
        }
    }
}
