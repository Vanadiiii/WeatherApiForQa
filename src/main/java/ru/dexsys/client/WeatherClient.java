package ru.dexsys.client;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class WeatherClient {
    private static final String BASE_URL = "https://weatherapi-com.p.rapidapi.com/search.json";

    private final RequestSpecification BASE_REQUEST_SPECIFICATION = RestAssured.given()
            .baseUri(BASE_URL)
            .header("x-rapidapi-host", "weatherapi-com.p.rapidapi.com")
            .header("x-rapidapi-key", "aa40f91989msh5da0b99dbbdf37cp1917c3jsnd43f2a421273");

    public String printCitiesByName(String city) {
        return BASE_REQUEST_SPECIFICATION
                .param("q", city)
                .get()
                .thenReturn()
                .body()
                .prettyPrint();
    }
}
