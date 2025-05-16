public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Chicken(), new Tiger()};
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Edible) {
                Edible edible = (Edible) animal;
                System.out.println(edible.howToEat());
            }
        }

        fruit[] fruits = {new Apple(), new Orange()};
        for (fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
