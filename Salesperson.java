package Merve_Hoca_Mext.Day2;

public class Salesperson extends Employee {
    private double comissionPercentage;

    public Salesperson(String name, double salary, int age,
                       double comissionPercentage) {
        super(name, salary, age);
        this.comissionPercentage = comissionPercentage;
    }

    public double getComissionPercentage() {
        return this.comissionPercentage;
    }

    public void raiseComission() {
        if (this.comissionPercentage < .30) {
            this.comissionPercentage =
                    this.comissionPercentage * 1.2;
        }
    }


}