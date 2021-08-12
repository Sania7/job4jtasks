package maphashmap;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Merge {
    /**
     * 1.8. Объединение значений в Map.
     *
     * Если необходимо объединить значение в Map с другим,
     * то для этой задачи можно воспользоваться методов merge():
     *
     * V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V>
     * remappingFunction) - метод выполняет связывание ключа key с
     * переданным значением value, если указанный ключ еще не связан со значением,
     * или связан с нулевым значением.
     * В противном случае произойдет замена значения,
     * которое соответствует key, результатами вычисления заданной
     * функции remappingFunction.
     *
     * @param names  метод принимает отображение - число(id пользователя)
     *               - строка(имя пользователя)
     * @param users список пользователей.
     * @return Возникла проблема -
     * данные в отображении хранились так долго и ранее не было предусмотрено,
     * что помимо имени необходимо хранить еще и фамилию.
     * Необходимо обновить информацию - если такой пользователь уже существует
     * (проверять по ключу) - то необходимо к имени добавить фамилию,
     * если нет - то сначала добавить пользователя - ключ id,
     * значение - имя пользователя, а потом только обновить и добавить фамилию.
     * При решении используйте методы putIfAbsent() и merge().
     */
    public static Map<Integer, String> collectData(Map<Integer, String> names, List<User> users) {
        for (User user : users) {
            names.putIfAbsent(user.getId(), user.getName());
            names.merge(user.getId(), user.getSurname(), (oldV, newV) -> oldV + " " + newV);
        }
        return names;
    }

    public static class User {
        private int id;
        private String name;
        private String surname;

        public User(int id, String name, String surname) {
            this.id = id;
            this.name = name;
            this.surname = surname;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
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
