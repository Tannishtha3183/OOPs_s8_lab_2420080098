package Lab4;
import java.util.*;
public class TestCalculator 
{
	    public static void main(String[] args)
	    {
	        calculator calculator = new calculator();
	        int sum = calculator.add(5, 3);
	        int difference = calculator.subtract(5, 3);

	        System.out.println("Sum: " + sum);
	        System.out.println("Difference: " + difference);
	    }
}
