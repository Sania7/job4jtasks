package maphashmap;

import java.util.Map;
import java.util.Objects;

public class PutIfAbsent {
    private final Map<Integer, User> users;

    public PutIfAbsent(Map<Integer, User> users) {
        this.users = users;
    }

    /**
     *1.2. Добавление элемента в отображение без проверки.
     * в интерфейсе Map<K, V> определен метод containsValue()
     *
     * boolean containsValue(V value) - метод возвращает true,
     * если отображение содержит значение value.
     *
     * @param u параметры метода
     * @return метод должен вернуть булево значение -
     * для этого необходимо проверить содержит ли отображение значение u.
     * В отображении ключом является id пользователя, значением - объект типа User.
     */
    public boolean addNewElement(User u) {
        // устанавливам флаг
       boolean rsl = false;
       // делаем проверку по ключу если нет
       if (!users.containsKey(u.getId())) {
           // то вставляем новую комбинацию ключ значение
           users.put(u.getId(), u);
           // в результат сохраняем проверенное значение
           rsl = users.containsValue(u);
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
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
