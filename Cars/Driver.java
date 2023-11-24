package com.company.professions;
public class Driver extends Person
{
    private int m_Experience;

    public Driver(int m_Age, int m_Experience) {
        super(m_Age);
        this.m_Experience = m_Experience;
    }

    @Override
    public String toString() {
        return "Водитель" +
                "Возраст " + getM_Age() + "\n" +
                "Опыт вождения " + m_Experience + "\n";

    }
}
