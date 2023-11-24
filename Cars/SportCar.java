package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car
{
    private int m_Speed;

    public SportCar(String carClass, Engine engine, Driver driver, String marka, int m_Speed) {
        super(carClass, engine, driver, marka);
        this.m_Speed = m_Speed;
    }
}
