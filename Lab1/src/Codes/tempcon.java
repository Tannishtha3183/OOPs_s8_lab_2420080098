package Codes;
import java.util.*;
public class tempcon {
	public static void main(String args []){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter temp(C): ");
		float temp= sc.nextFloat();
		int f=32;
		double ferh=(temp*9/5)+f;
		System.out.println("tempcon : " +ferh);
		
		
	}

}
