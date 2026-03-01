package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
        list.deleteCity(calgary);
        assertFalse(list.hasCity(calgary));

        assertThrows(IllegalArgumentException.class, () -> {
            list.deleteCity(new City("Halifax", "Nova Scotia"));
        });
    }


    @Test
    void testCountCities() {

       CustomList list = new CustomList();
        City victoria = new City("Victoria", "British Columbia");
        list.addCity(victoria);
        assertEquals(2, list.countCities());
        City winnipeg = new City("Winnipeg", "Manitoba");
        list.addCity(winnipeg);
        assertEquals(3, list.countCities());

    }

}
