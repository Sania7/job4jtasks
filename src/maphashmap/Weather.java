package maphashmap;

import java.util.*;

public class Weather {
    /**
     * 2.4. Данные об осадках
     *
     * 1. city - название города, где производились наблюдения;
     * 2. rainfall - количество осадков которые выпали в этом городе за период наблюдения.
     *
     * @param list
     * @return Необходимо реализовать метод так,
     * чтобы в результате вернулся список объектов Info
     * в котором будет указано имя города наблюдения и общее количество
     * осадков за период наблюдения.
     */
    public static List<Info> editData(List<Info> list) {
        // создаем результатирующий список rsl
        List<Info> rsl  = new ArrayList<>();
        // создаем мапу
        Map<String, Integer> city = new HashMap<>();
        // проходим циклом по списку и добавляем значения в мапу
        for (Info info : list) {
            city.computeIfPresent(info.getCity(), (key, value) -> value + info.getRainfall());
            city.putIfAbsent(info.getCity(), info.getRainfall());
        }
        // проходим циклом по мапе и добавляем элементы
        for (String s : city.keySet()) {
            // в результатирующий список
            rsl.add(new Info(s, city.get(s)));
        }
        return rsl;
    }
    public static class Info {
        private String city;
        private int rainfall;

        public Info(String city, int rainfall) {
            this.city = city;
            this.rainfall = rainfall;
        }

        public String getCity() {
            return city;
        }

        public int getRainfall() {
            return rainfall;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Info info = (Info) o;
            return rainfall == info.rainfall && Objects.equals(city, info.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, rainfall);
        }
    }
}
