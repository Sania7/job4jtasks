package lambda;

import java.util.function.Supplier;

public class MRSupplier {
    /**
     * 4.4. Method reference и Supplier
     * Интерфейс Supplier служит для того, чтобы обернуть логику создания объекта.
     * Он ничего не принимает, только возвращает объект, который ему поручили создать. Ссылки на методы поддерживает метод new, который позволяет нам создать нужный нам объект
     *
     * Например,
     *
     * Supplier<List<String>> supplier = ArrayList::new;
     *
     * List<String> list = supplier.get() // вернет ArrayList
     * @return задача вернуть Supplier, который создает пустую строку через new
     */
    public static Supplier<String> supplier() {
        return String::new;
    }
}
