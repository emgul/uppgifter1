import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class undantag {
    public static void uppgift_1() {
        int[] test = new int[10];
        Random r = new Random();
        for(int i=0 ; i<test.length ; i++) {
            test[i] = r.nextInt();
        }
        Scanner tgb = new Scanner(System.in);

        int choice;
        do {
            try {

                System.out.println("Skriv ett tal mella 1 och 10: ");
                choice = tgb.nextInt();
            } catch (InputMismatchException e) {
                choice = 99;
            }
        } while (choice < 0 || choice > 10);
        System.out.println("Du valde det " + choice + "e talet som var " + test[choice]);
    }
    public static void main(String[] args) {
        uppgift_1();

    }
}