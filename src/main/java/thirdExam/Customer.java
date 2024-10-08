package thirdExam;

public abstract class Customer extends Person{

private Cloth[] clothingItems;

    public Customer(String name, ISize size,Cloth[] clothingItems) {
        super(name, size);
        this.clothingItems = clothingItems;
    }

    public Cloth[] getClothingItems() {
        return clothingItems;
    }

    public void setClothingItems(Cloth[] clothingItems) {
        this.clothingItems = clothingItems;
    }

    public double printPriceAfterDiscount(Cloth clothingItem){
        return clothingItem.getPrice();
    }

}
