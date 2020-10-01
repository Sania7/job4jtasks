package pojo;

/*
Создаем класс с приватной переменной и аксессором к нему и метод для работы с этой переменной
 */

public class Service {
    private DbStore store;
    public Service(DbStore store) {
        this.store = store;
    }
    public void extract() {
        store.save("Petr Arsentev");
    }

    public static void main(String[] args) {
        DbStore store = new DbStore();
        Service service = new Service(store);
        service.extract();
    }
}
