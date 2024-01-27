import java.util.Scanner;

public class Temperature_Converter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Choose unit (Celsius, Fahrenheit, Kelvin): ");
        String selectedUnit = scanner.next();

        String result = convertTemperature(temperature, selectedUnit);

        System.out.println("Converted temperatures: " + result);
    }

    private static String convertTemperature(double temperature, String fromUnit) {
        String result = "";

        if (fromUnit.equals("Celsius")) {
            result = String.format("%.2f Fahrenheit, %.2f Kelvin",
                    (temperature * 9 / 5) + 32,
                    temperature + 273.15);
        } else if (fromUnit.equals("Fahrenheit")) {
            result = String.format("%.2f Celsius, %.2f Kelvin",
                    (temperature - 32) * 5 / 9,
                    (temperature + 459.67) * 5 / 9);
        } else if (fromUnit.equals("Kelvin")) {
            result = String.format("%.2f Celsius, %.2f Fahrenheit",
                    temperature - 273.15,
                    (temperature * 9 / 5) - 459.67);
        } else {
            result = "Invalid unit. Please choose Celsius, Fahrenheit, or Kelvin.";
        }

        return result;
    }
}