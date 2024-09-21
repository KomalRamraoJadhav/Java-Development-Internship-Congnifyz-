import java.util.*;
public class TemperatureConverter {

    public static void covertToFahrenheit(double temp){
        double Fahrenheit = temp * 9.0/5.0 + 32;
        System.out.println(temp +" celsius means "+ Fahrenheit + " fahrenheit" );
    }
    public static void covertToCelsius(double temp){
        double Celsius = 5.0/9.0 *(temp - 32);
        System.out.println(temp +" fahrenheit means "+ Celsius + " celsius" );
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:");
        System.out.println("1.Covert Celsius to Fahrenheit \n2.Covert Fahrenheit to Celsius");
        int choice = sc.nextInt();
        System.out.println("Enter temperature:");
        double temp = sc.nextDouble();
        switch (choice){
            case 1:
                covertToFahrenheit(temp);
                break;

            case 2:
                covertToCelsius(temp);
                break;
        }
    }
}
