package Lab4;
import java.util.*;
public class student {
	    private int rollNumber;
	    protected char grade;
	    public String name;
	    public void setDetails(int rollNumber, char grade, String name) {
	        this.rollNumber = rollNumber;
	        this.grade = grade;
	        this.name = name;
	    }
	    public void showDetails() {
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("Grade: " + grade);
	        System.out.println("Name: " + name);
	    }
	}
	