public class Main {

    public static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        } else {
            int hours = minutes/60;
            int mins = minutes%60;
            String h = hours < 10 ? "0" + hours : String.valueOf(hours);
            String m = mins < 10 ? "0" + mins : String.valueOf(mins);
            String s = seconds < 10 ? "0" + seconds : String.valueOf(seconds);
            return h + "h " + m + "m " + s + "s";
        }
    }

    public static String getDurationString(int seconds) {
        if(seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        return getDurationString(seconds/60,seconds%60);
    }
}
