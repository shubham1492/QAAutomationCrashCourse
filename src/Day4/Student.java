package Day4;

public class Student {

    int rollNumber;
    String name;

    Student(int rollNumber, String name){
        this.rollNumber = rollNumber;
        this.name = name;
    }

    void display(){
        System.out.println(rollNumber+ " "+ name);
    }

}
