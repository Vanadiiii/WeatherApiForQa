package ru.dexsys.entity;

import lombok.Data;

@Data
public class City {
    private long id;
    private String name;
    private String region;
    private String country;
    private double lat;
    private double lon;
    private String url;
}
