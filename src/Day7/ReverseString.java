package Day7;

public class ReverseString {
    public static void main(String[] args) {

        String str =  "Hello";
        //op - olleH

        String reverse = "";

        for(int i= str.length()-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reverse String: "+ reverse);


    }
}
