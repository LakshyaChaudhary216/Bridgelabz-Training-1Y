import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int count = 0;

        while (number != 0) {
            count++;
            number = number / 10;
        }

        System.out.println("Number of digits = " + count);
        input.close();
    }
}
