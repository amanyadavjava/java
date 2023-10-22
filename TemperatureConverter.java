// Convert Celsius into Fahrenheit and vice versa 
public class TemperatureConverter {
    
    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        double celsius = 25.0;
        double fahrenheit = 77.0;

        double result1 = celsiusToFahrenheit(celsius);
        System.out.println(celsius + " degrees Celsius is equal to " + result1 + " degrees Fahrenheit.");

        double result2 = fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + result2 + " degrees Celsius.");
    }
}
