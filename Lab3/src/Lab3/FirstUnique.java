package Lab3;
import java.util.Scanner;
public class FirstUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        char result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean repeat = false;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(j) == c) {
                    repeat = true;
                    break;
                }
            }
            if (!repeat) {
                result = c;
                break;
            }
        }
        System.out.println(result != 0 ? "First non-repeating character: " + result : "No non-repeating character found");
    }
}