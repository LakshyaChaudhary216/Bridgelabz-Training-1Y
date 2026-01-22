import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        double c;
		System.out.println("Please enter the value of celsius:");
		c=sc.nextDouble();

        double fahrenheit = (c * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit = " + fahrenheit);
    }
}
