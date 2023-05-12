package Temp;

import java.util.Scanner;

public class TempConverter implements TemperatureConverter {

    @Override
    public double convertToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    @Override
    public double convertToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temperature = input.nextDouble();

        TempConverter converter = new TempConverter();

        double fahrenheit = converter.convertToFahrenheit(temperature);
        double celsius = converter.convertToCelsius(temperature);

        System.out.println(temperature + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");
        System.out.println(temperature + " degrees Fahrenheit is " + celsius + " degrees Celsius.");
        input.close();
       
    }
}