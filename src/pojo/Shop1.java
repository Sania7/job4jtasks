package pojo;

public class Shop1 {
    public static int indexOfNull(Product[] products) {
        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            if (product == null) {
                return index;
            }
        }
        return -1;
    }
}
