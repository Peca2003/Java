public class Dog extends Animal
{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Пес " + m_Name + " лает");
    }

    @Override
    public void eat() {
        System.out.println("Пес " + m_Name + " ест мясо, кости");
    }

    @Override
    public void getDescription() {
        System.out.println("Пес по имени " + m_Name);
    }
}
