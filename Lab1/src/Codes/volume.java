package Codes;
import java.util.*;
public class volume {
	public static void main (String args []) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius :");

		int r= sc.nextInt();
		float pi=3.14f;
		double vol=4/3*pi*r*r*r;
		System.out.println("volume : "+vol);
		
		
	}
	

}
