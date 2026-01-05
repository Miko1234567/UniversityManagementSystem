import java.util.Objects;

// Абстракция: Жалпы адам бейнесі
public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Полиморфизм: toString әдісін барлық мұрагерлер үшін дайындау
    @Override
    public String toString() {
        return "Name: " + name;
    }
}
