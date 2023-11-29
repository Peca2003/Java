public class Bear extends Animal
{
    public Bear(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Медведь " + m_Name + " орёт");
    }

    @Override
    public void eat() {
        System.out.println("Медведь " + m_Name + " ест мёд");
    }

    @Override
    public void getDescription() {
        System.out.println("Медведь по имени " + m_Name);
    }
}
