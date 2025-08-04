package Codes;
import java.util.*;
public class vowcon_check {
	
	public static void main(String args []) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter : ");
		char a=sc.next().charAt(0);
		char[] vowels= {'a','e','i','o','u'};
		
		boolean vowel=false;
		for (char v :vowels) {
			if (a==v) {
				vowel=true;
				break;
			}
		}
		if (vowel) {
			System.out.println("vowel");}
		else {
			System.out.println("constant");
			}
	}		
}