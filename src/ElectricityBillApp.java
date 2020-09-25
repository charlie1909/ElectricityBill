import java.util.Scanner;

public class ElectricityBillApp {

    public static void main (String [] args){
        Bill bill = new Bill();
        bill.setUnits();
        bill.calculateBill();

        System.out.println("Bill: £ " + bill.getBill());
    }
}
