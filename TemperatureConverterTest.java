package TemperatureConverter;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class TemperatureConverterTest {

    @Test
    public void test() {
        double d = TemperatureConverter.celsisusToFahrenheit(0);
        assertEquals(32.0, d, 0.0);
    }

    @Test
    public void ctof() {
        double freeze = 0.0;
        double boil = 100.0;
        assertTrue (TemperatureConverter.celsisusToFahrenheit(freeze) == 32.0);
        assert (TemperatureConverter.celsisusToFahrenheit(boil) == 212.0);
    }

    @Test
    public void ftoc() {
        double freeze = 32.0;
        double boil = 212.0;
        assert (TemperatureConverter.fahrenheitToCelsius(freeze) == 0.0);
        assert (TemperatureConverter.fahrenheitToCelsius(boil) == 100.0);
    }
}