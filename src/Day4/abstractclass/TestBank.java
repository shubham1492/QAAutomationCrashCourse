package Day4.abstractclass;

import Day4.methodoverriding.Sbi;

public class TestBank {

    public static void main(String[] args) {

        SBI sbi = new SBI();
        PNB pnb = new PNB();

        System.out.println(sbi.getRateOfInterest());
        System.out.println(pnb.getRateOfInterest());
    }
}
