package com.company.details;
public class Engine
{
    private int m_Power;
    private String m_Company;

    public Engine(int power, String company) {
        this.m_Power = power;
        this.m_Company = company;
    }

    @Override
    public String toString() {
        return "Двигатель" +
                "Мощность: " + m_Power + "\n" +
                "Производитель: " + m_Company + "\n";
    }
}
