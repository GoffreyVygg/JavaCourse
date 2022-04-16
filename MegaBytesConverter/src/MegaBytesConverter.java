public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        }   else {
            System.out.println(kiloBytes + " kB = " + (kiloBytes / 1024) + " MB and " + (kiloBytes % 1024) + " kB");
        }
    }
}
