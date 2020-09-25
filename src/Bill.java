import java.util.Scanner;

public class Bill{

    private Scanner scanner = new Scanner(System.in);
    private double units;
    private double overallPrice;

    public Bill(){
    }

    public void setUnits() {
        System.out.println("Please enter number of units");
        units = scanner.nextDouble();
    }

    public double getUnits(){
        return units;
    }

    public void calculateBill() {
        if(units<=100){
            overallPrice = units * 0.267;
        }else{
            double restUnits = units - 100;
            overallPrice = (100 * 0.267) + (restUnits * 0.156);
        }
    }

    public double getBill() {
        return overallPrice;
    }
}
