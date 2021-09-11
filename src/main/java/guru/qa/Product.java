package guru.qa;

import com.sun.org.apache.xerces.internal.impl.xs.models.XSCMUniOp;

public class Product {
    String productId;
    String name;
    String color;
    int price;
    String[] sizes;
    boolean isAvailable;


    public Product(String productId, String name, String color, int price, String[] sizes, boolean isAvailable) {
        this.productId = productId;
        this.name = name;
        this.color = color;
        this.price = price;
        this.sizes = sizes;
        this.isAvailable = isAvailable;
    }

    boolean setNotAvailable() {
        this.isAvailable = false;
        return this.isAvailable;
    }

    void printProductsWithExpectedSize(String size) {
        for (int i = 0; i < sizes.length; i++){
            if (sizes[i].equals(size) && isAvailable==true) {
                printInfoAboutProductWithoutSize();
                System.out.println(" есть в размере " + size);
                return;
            }
        }
        printInfoAboutProductWithoutSize();
        System.out.println(" недоступен в размере " + size);
    }

    void printProductsWithAvailableSizes(String[] allSizes) {
        for (int j = 0; j < allSizes.length; j++) {
            int k = 0;
            for (int i = 0; i < sizes.length; i++) {
                if (sizes[i].equals(allSizes[j]) && isAvailable == true) {
                    printInfoAboutProductWithoutSize();
                    System.out.println(" есть в размере " + allSizes[j]);
                    k = k + 1;
                    break;
                }
            }
            if (k == 0) {
                printInfoAboutProductWithoutSize();
                System.out.println(" недоступен в размере " + allSizes[j]);
            }
        }
    }

    void printInfoAboutProductWithoutSize() {
        System.out.print("Продукт " + this.productId + " " + this.name  + " " + this.color);
    }
}
