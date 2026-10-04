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

        // OFF-BY-ONE
        int kurang = 0;

        for (int i = 1; i < n; i++) {
            kurang++;
        }

        int kurangSama = 0;

        for (int i = 1; i <= n; i++) {
            kurangSama++;
        }

        System.out.println();
        System.out.println("i <  n berputar : " + kurang + " kali");
        System.out.println("i <= n berputar : " + kurangSama + " kali");

        // CONTINUE DAN BREAK
        System.out.print("Disaring : ");

        int jumlahPrintln = 0;

        for (int i = 1; i <= 10; i++) {

            // Lewati angka genap
            if (i % 2 == 0) {
                continue;
            }

            // Berhenti jika i > 7
            if (i > 7) {
                break;
            }

            System.out.print(i + " ");
            jumlahPrintln++;
        }

        System.out.println();

        System.out.println("Sampai println : " + jumlahPrintln + " kali");

        /*
         * Kenapa loop tidak berhenti di i = 8?
         *
         * Pada i = 8, angka tersebut genap sehingga kondisi
         * i % 2 == 0 bernilai true dan continue dijalankan.
         *
         * continue melewati kode di bawahnya, sehingga kondisi
         * i > 7 yang berisi break tidak sempat diperiksa.
         *
         * Setelah itu loop lanjut ke i = 9. Karena 9 adalah angka
         * ganjil, continue tidak dijalankan. Kemudian kondisi
         * i > 7 menjadi true dan break dijalankan.
         *
         * Jadi hasilnya adalah 1 3 5 7.
         */

        /*
         * HASIL RUN PERTAMA (n = 5)
         *
         * Batas deret (n) : 5
         *
         * ===== SATU DERET, TIGA LOOP =====
         * for      : 1 2 3 4 5
         * while    : 1 2 3 4 5
         * do-while : 1 2 3 4 5
         *
         * i <  n berputar : 4 kali
         * i <= n berputar : 5 kali
         * Disaring : 1 3 5 7
         * Sampai println : 4 kali
         *
         * Process finished with exit code 0
         */


        /*
         * HASIL RUN KEDUA (n = 0)
         *
         * Batas deret (n) : 0
         *
         * ===== SATU DERET, TIGA LOOP =====
         * for      :
         * while    :
         * do-while : 1
         *
         * i <  n berputar : 0 kali
         * i <= n berputar : 0 kali
         * Disaring : 1 3 5 7
         * Sampai println : 4 kali
         *
         * Process finished with exit code 0
         *
         * Kesimpulan: do-while mengecek kondisinya sesudah badan loop dijalankan,
         * jadi badannya pasti jalan minimal sekali.
         */
    }
}