public class Vet
{
    public void treatAnimal(Animal animal)
    {
        System.out.println("Имя: " + animal.getM_Name());
        System.out.print("Описание: ");
        animal.getDescription();
    }
}
