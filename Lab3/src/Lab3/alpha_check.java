package Lab3;
import java.util.*;
public class alpha_check {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		
		//String a= sc.nextLine();
		if(ch>='a' && ch<='z' || ch>='A' && ch<='z') {
			System.out.println("The character is alphabet");				
			}
		else {
			System.out.println("The character is not an anphabet");
				
		} 
		
	}
	
}