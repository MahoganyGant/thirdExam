package thirdExam;

public class Manager extends Employee {
protected final double EXTRA_DISCOUNT = 0.15;
private double salary;

    public Manager(String name, ISize size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
    }

    public double getEXTRA_DISCOUNT() {
        return EXTRA_DISCOUNT;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return getSalary();
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
