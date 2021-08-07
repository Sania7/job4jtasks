package maphashmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PutContainsKey {
    /**
     * 1.1. Вставка новых элементов.
     *
     *V put(K key, V value) - помещает в коллекцию новый объект с ключом
     * key и значением value. Если в коллекции уже есть объект с подобным ключом,
     * то он перезаписывается. Если ключа еще не было в коллекции,
     * то метод возвращает null,
     * иначе - предыдущее значение которое соответствовало ключу key.
     * @param list принимает список пользователей
     * @return Выполняет вставку значений в отображение без проверки
     * содержится ли такой ключ уже в отображении.
     */
    public static Map<Integer, User> addNewElementWithoutCheck(List<User> list) {
        // создаем карту Map c данными пользователя User
        Map<Integer, User> rsl = new HashMap<>();
        // Проходим циклом по параметру list
        for (User user : list) {
            // вставляем в карту данные
            rsl.put(user.getId(), user);
        }
        return rsl;
    }

    /**
     *
     * @param list принимает список пользователей
     * @return Выполняет вставку значений в отображение с проверкой
     * содержится ли такой ключ уже в отображении.
     */
    public static Map<Integer, User> addNewElementWithCheck(List<User> list) {
        // создаем карту Map с данными пользователя User
        Map<Integer, User> rsl = new HashMap<>();
        //проходим циклом по списку list
        for (User user : list) {
            // если результат не равен данным в списке list
            if (!rsl.containsKey(user.getId())) {
                // добавляем в список данные по ключу значению
                rsl.put(user.getId(), user);
            }
        }
        return rsl;
    }

    public static class User {
        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return id == user.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }
}
