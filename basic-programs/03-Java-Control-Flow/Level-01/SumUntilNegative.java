import java.util.Scanner;

class SumUntilNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;

        while (true) {
            double number = input.nextDouble();
            if (number <= 0)
                break;
            sum += number;
        }

        System.out.println("Sum = " + sum);
        input.close();
    }
}
