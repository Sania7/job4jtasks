package pojo;

/*
 Смещение ячейки в конец массива, проходим по массиву от параметра index
 при прохождении плюсуем index++, далее увеличиваем количество при помощи счетчика products[i + 1]
 и в конце приравниваем значение последней ячейки значению null.
 */

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        for (int i = index; i < products.length - 1; index++) {
           products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
     return products;
    }
}
