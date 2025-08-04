package Lab3;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EventCountdown {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter event date & time (yyyy-MM-dd HH:mm): ");
        String input = sc.nextLine().trim();
        sc.close();

        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date eventDate = fmt.parse(input);
        Date now = new Date();
        if (eventDate.before(now)) {
            System.out.println("The event has already passed.");
            return;
        }

        long diffMs = eventDate.getTime() - now.getTime();
        long totalMinutes = diffMs / (1000 * 60);
        long days    = totalMinutes / (60 * 24);
        long hours   = (totalMinutes % (24 * 60)) / 60;
        long minutes = totalMinutes % 60;

        System.out.printf("Time remaining: %d days, %d hours, %d minutes%n",
                          days, hours, minutes);
    }
}
