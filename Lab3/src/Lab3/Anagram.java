package Lab3;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine().replaceAll("\\s+","").toLowerCase();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine().replaceAll("\\s+","").toLowerCase();
        System.out.println(isAnagram(s1, s2) ? "Anagrams" : "Not Anagrams");
        sc.close();
    }

    private static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        int[] freq = new int[26];
        for (char c : a.toCharArray()) freq[c - 'a']++;
        for (char c : b.toCharArray()) {
            if (--freq[c - 'a'] < 0) return false;
        }
        return true;
    }
}