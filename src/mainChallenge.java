import java.util.Scanner;

public class mainChallenge {

    public static void main()
    {
        getDurationString(3665);
        getDurationString(67, 15);
        getDurationString(-1);
        getDurationString(-1, -1);
    }

    public static void getDurationString(int seconds) {

        if (seconds <= 0) {
            System.out.println("Invalid duration");
        }
        else {

            int hours = seconds / 3600;
            int minutes = (seconds % 3600) / 60;
            int second = seconds % 60;


            System.out.println(hours + "h " + minutes + "m " + second + "s");
        }
    }

    public static void getDurationString(int minutes, int seconds) {

        if (minutes <= 0 && seconds <= 0) {
            System.out.println("Invalid duration");
        }
        else {

            int convertedSeconds = minutes * 60 + seconds;

            getDurationString(convertedSeconds);
        }
    }
}
