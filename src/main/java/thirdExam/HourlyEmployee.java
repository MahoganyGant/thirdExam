package thirdExam;

public class HourlyEmployee extends Employee{
private float hoursWorked;
private double hourlyWage;

    public HourlyEmployee(String name, ISize size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    @Override
    public double calculatePay() {
        return getHourlyWage() * getHoursWorked();
    }

    @Override
    public boolean canGetFired() {
        return true;
    }

    @Override
    public boolean payTaxOnEarnings() {
        return true;
    }
}
