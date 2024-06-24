package Day4.interfaceexample;

public class Hp implements Printable{

    public void print(){
        System.out.println("Hp Printer");
    }

    public static void main(String[] args) {
        Hp hp = new Hp();
        hp.print();
    }

}
