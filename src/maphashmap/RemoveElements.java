package maphashmap;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class RemoveElements {
    /**
     * 1.9. Удаление пар ключ-значение из отображения
     *
     *V remove(Object key) - метод удаляет из отображения пару ключ-значение по ключу key,
     *  который был передан в метод.
     *  При этом метод возвращает значение value из отображения которое
     *  соответствовало ключу key.
     *
     * boolean remove​(Object key, Object value) -
     * метод удаляет из отображения пару ключ-значение только в том случае,
     * если переданный ключ key в настоящее время сопоставлен со значением value,
     * которое также передано в методе.
     * При этом метод возвращает true если значение было удалено.
     *
     * @param data
     * @param ids параметры ids
     * @param users параметры users
     * @return Необходимо обновить информацию в отображении следующим образом:
     * 1. Удалить все пары ключ-значение которые соответствуют каждому id из списка id
     * 2. Удалить все пары ключ значения,
     * которые соответствуют списку пользователей
     * (тут будет необходимо использовать геттеры,
     * чтобы получить доступ к значениям в полях объектов типа User).
     */
    public static Map<Integer, String> removeElement(Map<Integer, String> data,
                                                     List<Integer> ids,
                                                     List<User> users) {
        for (Integer id : ids) {
            data.remove(id);
        }
        for (User user : users) {
            data.remove(user.getId(), user.getName());
        }
        return data;
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

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return id == user.id && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }
}
