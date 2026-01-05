import java.util.Objects;

public class Professor extends Person {
    private String department;

    public Professor(String name, String department) {
        super(name); // Аталық кластың конструкторын шақыру
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Professor [Name: " + getName() + ", Department: " + department + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(getName(), professor.getName()) && 
               Objects.equals(department, professor.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), department);
    }
}
