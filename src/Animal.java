import java.util.Objects;

public abstract class Animal {
    private final String name;
    private int year;

    public abstract void eat();

    public abstract void sleeping();

    public abstract void go();

    public Animal(String name, int year) {
        this.name = ValidationUtils.validOfDefault(name, "Информация не предоставлена");
        setYear(year);
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = ValidationUtils.validOfIntDefault(year, 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return year == animal.year && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }
}
