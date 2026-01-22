import java.util.Scanner;
public class AreaOfCircle{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double r;
		System.out.println("Please enter the value of radius:");
		r=sc.nextDouble();
		double area=(22.0/7.0)*r*r;
		System.out.print("Area Of Circle is:"+ area);
	}
}