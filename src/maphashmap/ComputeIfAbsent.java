package maphashmap;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ComputeIfAbsent {
    /**
     *1.6. Вычисление значений в отображении если ключа не существует
     *
     * В интерфейсе Map<K, V> определен особый метод,
     * который позволяет вычислить значение в том случае,
     * если такого ключа в отображении нет или значение ассоциированное
     * с ключом равно null. Посмотрим как определен этот метод:
     *
     * V computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)
     * - если в отображении заданный ключ key еще не связан со значением
     * (или значение равно null), будет выполнено вычисление значение в
     * соответствии с использованием заданной функции mappingFunction и
     * это значение будет введено в отображение.
     *
     * @param names параметры метода
     * @param users список User
     * @return возвращаемое значение
     * Задание:
     * метод принимает отображение в котором содержатся пары ключ(число)
     * - значение(строка), при этом строка -
     * это имя пользователя(в отображении они представлены пустой строкой),
     * ключ - его id.
     * Также в качестве аргумента метод принимает список пользователей.
     * Необходимо реализовать метод, который произведет ассоциацию id и
     * name пользователя в отображении.
     * При этом:
     *
     * 1. Если такой ключ уже есть в отображении
     * - метод должен обновить ассоциацию(используйте computeIfPresent()).
     *
     * 2. Если такого ключа нет
     * - метод должен добавить ассоциацию(используйте computeIfAbsent()).
     */
    public static Map<Integer, String> collectData(Map<Integer, String> names
            , List<User> users) {

        for (User user : users) {
            names.computeIfPresent(user.getId(), (key, value) -> user.getName());
            names.computeIfAbsent(user.getId(), key -> user.getName());
        }
        return names;
    }



    public static class User {
        private int id;
        private String  name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
