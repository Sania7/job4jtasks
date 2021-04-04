package arrayList;

import java.util.List;


/*
   6. Удаление и замена элементов в списке
   E remove(int index) - удаляет элемент из списка по индексу index, при этом метод возвращает удаленный элемент.
   E set(int index, E e) - заменяет значение элемента, который имеет индекс index,
    значением e. При этом метод возвращает старое значение элемента с индексом index.


 */

public class RepositionElement {
    public static List<String> changePosition(List<String> list, int index) {

            if (index < list.size()) { // проверяем index чтобы не превышал размер списка
                list.set(index, list.remove(list.size() - 1)); // заменяем index
            } else {
                list.remove(list.size() - 1);// удаляем последний index
            }
        return list;
    }
}
