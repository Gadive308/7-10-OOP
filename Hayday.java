import java.util.ArrayList;
import java.util.List;

public class Hayday {
    public static void main(String[] args) {
        List<Animal> animals = List.of(
                new Pig(true, false),
                new Duck(true, true),
                new Fish(false, true)
        );

        List<String> walkingAnimals = new ArrayList<>();
        List<String> swimmingAnimals = new ArrayList<>();

        for (Animal animal : animals) {
            if (animal.isWalk()) {
                walkingAnimals.add(animal.getSpecies());
            }
            if (animal.isSwim()) {
                swimmingAnimals.add(animal.getSpecies());
            }
        }
        System.out.println("Walking Animals: ");
        for (String animal : walkingAnimals) {
            System.out.println(animal + " ");
        }
        System.out.println("Swimming Animals: ");
        for (String animal : swimmingAnimals) {
            System.out.println(animal + " ");
        }
    }
}