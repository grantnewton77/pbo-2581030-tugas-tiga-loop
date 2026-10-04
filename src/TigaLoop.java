import java.util.Scanner;

public class TigaLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Batas deret (n) : ");
        int n = input.nextInt();

        System.out.println();
        System.out.println("===== SATU DERET, TIGA LOOP =====");

        // FOR
        System.out.print("for      : ");

        int iFor = 1;

        for (iFor = 1; iFor <= n; iFor++) {
            System.out.print(iFor + " ");
        }

        System.out.println();


        // WHILE
        System.out.print("while    : ");

        int iWhile = 1;

        while (iWhile <= n) {
            System.out.print(iWhile + " ");
            iWhile++;
        }

        System.out.println();


        // DO-WHILE
        System.out.print("do-while : ");

        int iDoWhile = 1;

        do {
            System.out.print(iDoWhile + " ");
            iDoWhile++;
        } while (iDoWhile <= n);

        System.out.println();
    }
}