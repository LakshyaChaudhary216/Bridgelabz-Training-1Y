import java.util.Scanner;
public class AddTwoNumbers {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a;
        int b;
		System.out.println("Please enter the value of a:");
		a=sc.nextInt();
		System.out.println("Please enter the value of b:");
		b=sc.nextInt();
		
        int sum = a + b;

        System.out.println("Sum = " + sum);
    }
}
