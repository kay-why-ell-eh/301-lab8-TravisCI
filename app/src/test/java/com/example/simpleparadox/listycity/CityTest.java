package com.example.simpleparadox.listycity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CityTest {

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    void testGetCityName() {
        City city = mockCity();
        assertEquals(city.getCityName(), "edmonton");
    }

    @Test
    void testGetProvinceName() {
        City city = mockCity();
        assertEquals(city.getProvinceName(), "alberta");
    }
}
