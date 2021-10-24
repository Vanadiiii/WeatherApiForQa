package ru.dexsys.client;

import ru.dexsys.entity.City;

import java.util.List;

public interface WeatherClient {
    List<City> getCitiesByName(String city);
}
