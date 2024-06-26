package Day5;

public class Bike {

    int speed;
    String name;

    void display(){
        System.out.println(speed+" "+name);
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.display();
    }
}
