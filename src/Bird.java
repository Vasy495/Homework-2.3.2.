import java.util.Objects;

public abstract class Bird extends Animal {

    private final String habitat;

    public Bird(String name, int year, String habitat) {
        super(name, year);
        this.habitat = ValidationUtils.validOfDefault(habitat, "Информация не задана");
    }

    public String getHabitat() {
        return habitat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(habitat, bird.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }
}
