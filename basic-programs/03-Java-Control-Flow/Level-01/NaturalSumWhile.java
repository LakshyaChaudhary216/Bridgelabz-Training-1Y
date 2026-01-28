import java.util.Scanner;

class NaturalSumWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n > 0) {
            int sum = 0;
            int i = 1;

            while (i <= n) {
                sum += i;
                i++;
            }

            int formulaSum = n * (n + 1) / 2;
            System.out.println("While loop sum = " + sum);
            System.out.println("Formula sum = " + formulaSum);
        }

        input.close();
    }
}
