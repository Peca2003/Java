public abstract class Animal
{
    protected String m_Name;
    public abstract void makeNoise();
    public abstract void eat();
    public abstract void getDescription();

    public Animal(String name) {
        this.m_Name = name;
    }

    public String getM_Name() {
        return m_Name;
    }
}
