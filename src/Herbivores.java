import java.util.Objects;

public class Herbivores extends Mammal {
    private final String typeOfFood;
    public Herbivores(String name, int year, String habitat, int speed, String typeOfFood) {
        super(name, year, habitat, speed);
        this.typeOfFood = ValidationUtils.validOfDefault(typeOfFood, "Информация не задана");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    @Override
    public String toString() {
        return "Животное: " + getName() +
                " / Возраст: " + getYear() +
                " лет / Среда проживания: " + getHabitat() +
                " / Скорость: " + getSpeed() +
                " км/ч / Тип пищи: " + getTypeOfFood();
    }

    @Override
    public void eat() {
        System.out.println("Умею ржать");
    }

    @Override
    public void sleeping() {

    }

    @Override
    public void go() {
        System.out.println("Мчу");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }
}
