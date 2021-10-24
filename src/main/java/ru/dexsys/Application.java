package ru.dexsys;

import ru.dexsys.client.WeatherClient;

public class Application {
    public static void main(String[] args) {
        WeatherClient client = new WeatherClient();

        client.printCitiesByName("Izhevsk");
    }
}
