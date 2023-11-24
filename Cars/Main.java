package cars;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.professions.Person;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main
{
    public static void main(String[] args)
    {
        Person driverLorry = new Driver(35, 27);
        Person driverSport = new Driver(37, 12);
        Engine engineLorry = new Engine(250, "Volvo");
        Engine engineSport = new Engine(1000, "Bugatti");
        Car lorry = new Lorry("Грузовик", engineLorry, (Driver) driverLorry, "Volvo", 35);
        Car sport = new SportCar("Спорткар", engineSport, (Driver) driverSport, "Bugatti", 320);
        System.out.println(lorry.toString());
        System.out.println(sport.toString());
    }
}
