import java.util.Scanner;

class YoungestTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ageA = input.nextInt();
        int ageB = input.nextInt();
        int ageC = input.nextInt();

        double heightA = input.nextDouble();
        double heightB = input.nextDouble();
        double heightC = input.nextDouble();

        if (ageA <= ageB && ageA <= ageC) {
            System.out.println("Amar is youngest");
        } else if (ageB <= ageA && ageB <= ageC) {
            System.out.println("Akbar is youngest");
        } else {
            System.out.println("Anthony is youngest");
        }

        if (heightA >= heightB && heightA >= heightC) {
            System.out.println("Amar is tallest");
        } else if (heightB >= heightA && heightB >= heightC) {
            System.out.println("Akbar is tallest");
        } else {
            System.out.println("Anthony is tallest");
        }

        input.close();
    }
}
