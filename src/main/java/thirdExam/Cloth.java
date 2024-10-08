package thirdExam;

public class Cloth implements ISize{
    private String name;
    private double price;
private ISize size;

    public Cloth(String name, double price, ISize size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ISize getSize() {
        return size;
    }

    public void setSize(ISize size) {
        this.size = size;
    }
}
