import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Clock {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatHow = DateTimeFormatter.ofPattern("HH:mm");

        String formattedTime = currentTime.format(formatHow);
        System.out.printf("The current" + ANSI_RED + "time" + ANSI_RESET + "is " + formattedTime);
    }
}

// I coulnd't print colour because I don't have a fancy terminal. How do i get the one Jouse had?