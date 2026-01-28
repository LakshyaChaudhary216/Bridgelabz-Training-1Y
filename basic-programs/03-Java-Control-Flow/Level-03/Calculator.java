import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        char op = input.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid Operator");
        }

        input.close();
    }
}
