public class Main
{
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Том"),
                new Dog("Шарик"),
                new Bear("Миша")
        };

        Vet vet = new Vet();

        for (Animal animal : animals)
        {
            vet.treatAnimal(animal);
            System.out.println();
        }

        System.out.println();

        for (Animal animal : animals)
        {
            animal.makeNoise();
            animal.eat();
            System.out.println();
        }
    }
}
