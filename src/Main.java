import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int basCounter;

        System.out.print("Basamak sayisini giriniz: ");
        basCounter = input.nextInt();

        for (int k = 1; k <= basCounter; k++) {
            for (int i = 1; i <= k; i++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * (basCounter-k+1)) - 1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
