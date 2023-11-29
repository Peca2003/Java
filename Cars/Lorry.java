package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car
{
    private int m_Carrying;
    public Lorry(String carClass, Engine engine, Driver driver, String marka, int carring) {
        super(carClass, engine, driver, marka);
        this.m_Carrying = carring;
    }



    @Override
    public String toString() {
        return "Грузовик" +
                "\nКласс автомобиля: " + getM_CarClass() + "\n" +
                "Двигатель: " + getM_Engine() + "\n" +
                "Водитель: " + getM_Driver() + "\n" +
                "Марка: " + getM_Marka() + "\n" +
                "Грузоподъемность: " + m_Carrying;
    }
}
