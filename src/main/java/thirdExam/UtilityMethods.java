package thirdExam;

public class UtilityMethods {
    public static boolean checkFitting(Customer name, Cloth clothingItem){
        if(name.getSize().equals(clothingItem.getSize())){
            System.out.println("This clothing item size is  match");
            return true;
        }
return false;
    }
    public static double calculateSubtotal(Cloth[] clothingItems){
        double subTotal = 0.0;
        for( Cloth clothingItem : clothingItems){
            subTotal += clothingItem.getPrice();
        }
        return subTotal;
    }
public static void printNamesOfPayableEntities(IPayable[]payableEntities){
        for(IPayable entity : payableEntities){
            System.out.println(entity);
        }
}
public static void checkCustomerDiscount(Customer customer) {
        if(customer instanceof Employee){
            System.out.println("Discount is: "+((Employee) customer).getDISCOUNT());
        } else if(customer instanceof Student){
            System.out.println("Discount is: "+((Student) customer).getDISCOUNT());
        }else if(customer instanceof Manager){
            System.out.println("Discount is: "+((Employee) customer).getDISCOUNT());
        }
    }
}
