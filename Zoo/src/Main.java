import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    private String name;
    private int age;
    private String species;

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }
}

class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age, "Lion");
    }

    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }
}

class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age, "Elephant");
    }

    @Override
    public void makeSound() {
        System.out.println("Trumpet!");
    }
}

class Giraffe extends Animal {
    public Giraffe(String name, int age) {
        super(name, age, "Giraffe");
    }

    @Override
    public void makeSound() {
        System.out.println("Neck stretching sound!");
    }
}

class Penguin extends Animal {
    public Penguin(String name, int age) {
        super(name, age, "Penguin");
    }

    @Override
    public void makeSound() {
        System.out.println("Honk!");
    }
}

class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void makeAllSounds() {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    public double calculateAverageAge() {
        if (animals.isEmpty()) {
            return 0;
        }

        int totalAge = 0;
        for (Animal animal : animals) {
            totalAge += animal.getAge();
        }

        return (double) totalAge / animals.size();
    }

    public void displayAnimalDetails() {
        for (Animal animal : animals) {
            System.out.println("Name: " + animal.getName() +
                    ", Age: " + animal.getAge() +
                    ", Species: " + animal.getSpecies() +
                    ", Sound: ");
            animal.makeSound();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Lion lion = new Lion("Leo", 5);
        Elephant elephant = new Elephant("Dumbo", 8);
        Giraffe giraffe = new Giraffe("Gerry", 3);
        Penguin penguin = new Penguin("Penny", 2);

        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);
        zoo.addAnimal(giraffe);
        zoo.addAnimal(penguin);

        zoo.makeAllSounds();

        System.out.println("Average Age: " + zoo.calculateAverageAge());

        zoo.displayAnimalDetails();
    }
}
