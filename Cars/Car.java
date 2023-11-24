package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car
{
    private String m_CarClass;
    private Engine m_Engine;
    private Driver m_Driver;
    private String m_Marka;

    public Car(String carClass, Engine engine, Driver driver, String marka)
    {
        this.m_CarClass = carClass;
        this.m_Engine = engine;
        this.m_Driver = driver;
        this.m_Marka = marka;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public String getM_CarClass() {
        return m_CarClass;
    }
    public Engine getM_Engine() {
        return m_Engine;
    }
    public Driver getM_Driver() {
        return m_Driver;
    }
    public String getM_Marka() {
        return m_Marka;
    }

    @Override
    public String toString() {
        return "Автомобиль" +
                "\nКласс автомобиля: " + m_CarClass + "\n" +
                "Двигатель: " + m_Engine + "\n" +
                "Водитель: " + m_Driver + "\n" +
                "Марка автомобиля: " + m_Marka + "\n";
    }
}
