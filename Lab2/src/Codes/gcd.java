package Codes;
import java.util.*;
public class gcd {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter : ");
		int a = sc.nextInt();
		System.out.println("enter : ");
		int b = sc.nextInt();
		int max=0;
		int limit =Math.min(a, b);
		for(int i=1; i<limit; i++)
		{
			if (a%i == 0 && b%i == 0 && i>max) {
				max=i;
			}
		}
		System.out.println(max);
	}
	
	

}
