import java.util.Scanner;

class CountdownFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();

        for (int i = count; i >= 1; i--) {
            System.out.println(i);
        }

        input.close();
    }
}
