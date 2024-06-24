package Day4.methodoverloading;

public class Adder {

    int add(int a,int b){
        int result = a+b;
        return result;
    }

    int add(int a , int b,int c){
        int result = a+ b + c;
        return result;
    }
}
