package Day4.interfaceexample;

public class Dell  implements Printable{

    public void print(){
        System.out.println("Dell Printer");
    }

    public static void main(String[] args) {

        Dell dell = new Dell();
        dell.print();
    }
}
