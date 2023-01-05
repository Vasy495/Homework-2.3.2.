public class Main {
    public static void main(String[] args) {

        Herbivores gazel = new Herbivores("Газель", 5, "Фауна", 45, "Трава");
        Herbivores jiraf = new Herbivores("Жираф", 7, "Фауна", 7, "Трава");
        Herbivores hors = new Herbivores("Лошадь", 4, "Загон", 40, "Трава");

        System.out.println(gazel);
        gazel.eat();
        gazel.go();

        Predator giena = new Predator("Гиена", 4, "Фауна", 35, "Мясо");
        Predator tiger = new Predator("Тигр", 3, "Фауна", 35, "Мясо");
        Predator beer = new Predator("Медведь", 8, "Лес", 30, "Мясо");

        System.out.println(giena);
        giena.eat();
        giena.go();

        Amphibian lagushka = new Amphibian("Лягушка", 1, "Водоем");
        Amphibian uz = new Amphibian("Уж пресноводный", 2, "Водоем");

        System.out.println(uz);
        uz.eat();
        uz.go();

        Flightless pavlin = new Flightless("Павлин", 2, "Водоем", "Ходьба");
        Flightless pingvin = new Flightless("Пингвин", 3, "Водоем", "Ходьба");
        Flightless dodo = new Flightless("Птица Додо", 1, "Водоем", "Ходьба");

        System.out.println(pavlin);
        pavlin.eat();
        pavlin.go();

        Flying chayka = new Flying("Чайка", 2, "Водоем", "Полет");
        Flying albatros = new Flying("Альбатрос", 3, "Водоем", "Полет");
        Flying sokol = new Flying("Сокол", 4, "Поле", "Полет");

        System.out.println(chayka);
        chayka.eat();
        chayka.go();
    }
}