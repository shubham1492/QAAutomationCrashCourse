package Day4.methodoverriding;

import java.util.SortedMap;

public class TestMethodOverriding {
    public static void main(String[] args) {

        Bank bank = new HDFC();
        System.out.println("HDFC Bank "+ bank.getRateOfInterest());

        bank = new Sbi();
        System.out.println("SBI Bank "+ bank.getRateOfInterest());

    }
}
