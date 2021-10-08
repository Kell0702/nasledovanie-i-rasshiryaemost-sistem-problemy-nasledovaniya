package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    @Test
    void shouldManufacturer() {
        Smartphone smartphone = new Smartphone(1, "Смартфон", 1000, "samsung");
        smartphone.getManufacturer();
        String expected = smartphone.getManufacturer();
        String actual = "samsung";
        assertEquals(expected, actual);
    }
}