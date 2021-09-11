package guru.qa;

public class Main {
    public static void main(String[] args) {
        String[] allSizes = {"S", "M", "L", "XL", "XXL"};
        Product shirt = new Product("001", "shirt", "green", 100, new String[]{"S", "M", "L"}, true);
        Product blouse = new Product("002", "blouse", "blue", 110, new String[]{"XS", "M", "XXL"}, true);
        Product top = new Product("003", "top", "blue", 80, new String[]{"S", "M", "XXL"},true);

        top.setNotAvailable();

        shirt.printProductsWithAvailableSizes(allSizes);
        blouse.printProductsWithAvailableSizes(allSizes);
        top.printProductsWithAvailableSizes(allSizes);
    }
}
