import java.util.Objects;

public class Flightless extends Bird {
    private final String movementType;

    public Flightless(String name, int year, String habitat, String movementType) {
        super(name, year, habitat);
        this.movementType = ValidationUtils.validOfDefault(movementType, "Информация не задана");
    }

    public String getMovementType() {
        return movementType;
    }

    @Override
    public String toString() {
        return "Животное: " + getName() +
                " / Возраст: " + getYear() +
                " лет / Среда проживания: " + getHabitat() +
                " / Тип передвижения: " + getMovementType();
    }

    @Override
    public void eat() {
        System.out.println("Умею крякать");
    }

    @Override
    public void sleeping() {

    }

    @Override
    public void go() {
        System.out.println("лечу");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(movementType, that.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }
}
