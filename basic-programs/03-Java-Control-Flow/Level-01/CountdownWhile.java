import java.util.Scanner;

class CountdownWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();

        while (count >= 1) {
            System.out.println(count);
            count--;
        }

        input.close();
    }
}
