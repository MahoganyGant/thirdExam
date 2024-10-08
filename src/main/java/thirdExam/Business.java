package thirdExam;

public class Business implements IPayable{
    private String name;
    private int productQtySupplied;
    private double productPrice;

    public Business(String name, int productQtySupplied, double productPrice) {
        this.name = name;
        this.productQtySupplied = productQtySupplied;
        this.productPrice = productPrice;
    }

    public String getName() {
        return name;
    }

    public int getProductQtySupplied() {
        return productQtySupplied;
    }

    public void setProductQtySupplied(int productQtySupplied) {
        this.productQtySupplied = productQtySupplied;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public double calculatePay() {
        return getProductPrice() * getProductQtySupplied();
    }

    @Override
    public boolean payTaxOnEarnings() {
        return true;
    }
}
