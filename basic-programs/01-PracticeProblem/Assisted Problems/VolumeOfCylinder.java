import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double radius, height;

        System.out.print("Enter the radius: ");
        radius = sc.nextDouble();

        System.out.print("Enter the height: ");
        height = sc.nextDouble();

        double pi = 22.0 / 7.0;
        double volume = pi * radius * radius * height;

        System.out.println("Volume of Cylinder is: " + volume);

        sc.close();
    }
}
