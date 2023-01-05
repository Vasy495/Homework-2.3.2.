import java.util.Arrays;
import java.util.Objects;

public class Amphibian extends Animal {

    private final String habitat;

    private Amphibian[] amphibians;

    public Amphibian(String name, int year, String habitat) {
        super(name, year);
        this.habitat = ValidationUtils.validOfDefault(habitat, "Информация не задана");

        amphibians = new Amphibian[0];

    }

    public String getHabitat() {
        return habitat;
    }


    @Override
    public String toString() {
        return "Животное: " + getName() +
                " / Возраст: " + getYear() +
                " лет / Среда проживания: " + getHabitat();
        }

    @Override
    public void eat() {
        System.out.println("Умею шипеть");
    }

    @Override
    public void sleeping() {

    }

    @Override
    public void go() {
        System.out.println("ползу");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibian amphibian = (Amphibian) o;
        return Objects.equals(habitat, amphibian.habitat) && Arrays.equals(amphibians, amphibian.amphibians);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), habitat);
        result = 31 * result + Arrays.hashCode(amphibians);
        return result;
    }
}
