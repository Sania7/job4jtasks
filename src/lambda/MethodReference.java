package lambda;

import java.util.function.Consumer;

public class MethodReference {
    /**
     * 4.1. Method reference. Обращение через класс и объект
     *
     * задача написать два consumer первый обращается к нестатическому методу,
     * а второй к статическому
     */
    public void applyByInstance() {
        // your code here
        Consumer<String> consumer = this::consumerByInstance;
        consumer.accept("Hello");
    }

    public static void applyByClass() {
        // your code here
        Consumer<String> consumer = MethodReference::consumerByClass;
        consumer.accept("Hello");
    }

    private void consumerByInstance(String input) {
        System.out.print("From instance: " + input);
    }

    private static void consumerByClass(String input) {
        System.out.print("From class: " + input);
    }
}
