package maphashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetOrDefault {

    private Map<Integer, List<String>> store = new HashMap<>();

    /**
     *1.4. Возврат отличных от null значений по умолчанию.
     *В интерфейсе Map<K, V> определен особый метод getOrDefault() который позволяет избежать того,
     *  что по умолчанию метод get() возвращает null.
     *  Этот метод полезен тем, что мы можем задать иное поведение при получении значения из отображения.
     *  Особенно полезным этот метод будет,
     *  когда значение в отображении представляет собой коллекцию объектов - List, Set и т.д.
     *
     * V getOrDefault(K k, V defaultValue) - метод возвращает значение объекта,
     * ключ которого равен k. Если такого элемента не окажется, то будет возвращено значение defaultValue.
     *
     * Задание: необходимо реализовать метод, который позволит добавить элемент list(значение)
     * с ключом index в хранилище store только в том случае, если такого ключа пока еще нет в хранилище.
     * Метод getValue() должен вернуть значение которое соответствует ключу index,
     * если такого ключа нет - необходимо вернуть пустой список.
     *
     * @param index ключ
     * @param list список параметров
     */

    public void addValue(int index, List<String> list) {
        if (!store.containsKey(index)) {
            store.put(index, list);
        }
    }

    public List<String> getValue(int index) {
        return store.getOrDefault(index, new ArrayList<>());
    }



}
