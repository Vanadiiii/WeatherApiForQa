package ru.dexsys;

import ru.dexsys.client.WeatherClient;
import ru.dexsys.client.impl.WeatherClientImpl;
import ru.dexsys.entity.City;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        WeatherClient client = new WeatherClientImpl();

        List<City> cities = client.getCitiesByName("Izhevsk");

        System.out.println(cities);
    }
}
