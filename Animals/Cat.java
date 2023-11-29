public class Cat extends Animal
{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Кот " + m_Name + " мяукает");
    }

    @Override
    public void eat() {
        System.out.println("Кот " + m_Name + " ест сухой и влажный корм");
    }

    @Override
    public void getDescription() {
        System.out.println("Кот по имени " + m_Name);
    }
}
