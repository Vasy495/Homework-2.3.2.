import java.util.Objects;

public abstract class Mammal extends Animal {
    private final String habitat;
    private int speed;

    public Mammal(String name, int year, String habitat, int speed) {
        super(name, year);
        this.habitat = ValidationUtils.validOfDefault(habitat, "Информация не задана");
        setSpeed(speed);
    }

    public String getHabitat() {
        return habitat;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = ValidationUtils.validOfIntDefault(speed, 0);


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return speed == mammal.speed && Objects.equals(habitat, mammal.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat, speed);
    }
}
