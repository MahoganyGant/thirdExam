package thirdExam;

public abstract class Employee extends Customer implements ITerminateAble, IPayable{
    final protected double DISCOUNT = 0.1;

    public Employee(String name, Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
    }

    public double getDISCOUNT() {
        return DISCOUNT;
    }
}
