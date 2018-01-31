package TemperatureConverter;

/**
 * Class that converts temperatures between farenheit and celsius
 * @author Matt
 */
public class TemperatureConverter {
    /**
     * Converts celsius temperatures into farenheit
     * @param celsius is a double input to be converted to farenheit
     * @return the original temperature in farenheit as a double
     */
    public static double celsisusToFahrenheit(double celsius) {
        double fahrenheit = (9.0/5.0)*celsius + 32;
        return fahrenheit;
    }

    /**
     * Converts farenheit temperatures into celsius
     * @param fahrenheit is a double input to be converted to celsius
     * @return the original temperature in celsius as a double
     */
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0/9.0)*(fahrenheit - 32);
        return celsius;
    }
}
