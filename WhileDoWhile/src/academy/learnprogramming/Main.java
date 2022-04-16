package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        while(count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        for(count = 1; count != 6; count++) {
            System.out.println("Count value is " + count);
        }

        count = 1;
        while(true) {
            if(count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while(count != 6);

        int num = 4;
        int finNum = 20;
        int found = 0;

        while(num <= finNum) {
            num++;
            if(!isEvenNumber(num)) {
                continue;
            }
            System.out.println("Even number: " + num);
            found++;
            if(found == 5) {
                break;
            }
        }
        System.out.println("Found " + found + " even numbers");

    }

    private static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }

}

