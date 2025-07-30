package lab2;
import java.util.Scanner;
public class s_calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1 :");
		int a=sc.nextInt();
		System.out.print("enter num2 :");
		int b=sc.nextInt();
		int c=a+b;
		int d=a*b;
		int e=a/b;
		int f=a%b;
		int g=a-b;
		
		System.out.println("sum is :"+c);
		System.out.println("product is :"+d);
		System.out.println("remainder is :"+e);
		System.out.println("modulus is :"+f);
		System.out.println("sub is :"+g);
	}

}
