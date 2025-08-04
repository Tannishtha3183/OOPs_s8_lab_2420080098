package Codes;
import java.util.*;
public class sum_no {
	public static void main(String [] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
	    int num = sc.nextInt();
	    sc.close();
	    int temp = Math.abs(num);
	    int sum = 0;
	    while (temp > 0) {
	    	sum += temp % 10;
	    	temp /= 10;
	    }
	    System.out.println("Sum of digits: "+sum);
	}
	

}
