package academy.learnprogramming;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int value = 1;
        if(value == 1) {
            System.out.println("Value was 1");
        } else if(value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

        int switchValue = 3;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Dunno, homes");
                break;

            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

        char switchChar = 'F';

        switch(switchChar) {
            case 'A':
                System.out.println("Found value of A");
                break;
            case 'B':
                System.out.println("Found value of B");
                break;
            case 'C':
                System.out.println("Found value of C");
                break;
            case 'D':
                System.out.println("Found value of D");
                break;
            case 'E':
                System.out.println("Found value of E");
                break;
            default:
                System.out.println("Not found");
                break;
        }

        String month = "janUARy";

        switch(month.toLowerCase(Locale.ROOT)) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }

    }
}
