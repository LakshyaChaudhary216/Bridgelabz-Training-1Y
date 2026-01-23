import java.util.Scanner;

class QuotientRemainder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int quotient = a / b;
        int remainder = a % b;

        System.out.println(
            "The Quotient is " + quotient +
            " and Reminder is " + remainder +
            " of two number " + a +
            " and " + b
        );
    }
}
