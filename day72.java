import java.util.Scanner;

public class day72 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka;
        int total = 0;

        System.out.println("Masukkan angka (angka negatif untuk berhenti)");

        while (true) {
            System.out.print("Masukkan angka: ");
            angka = input.nextInt();

            if (angka < 0) {
                break;
            }

            total += angka;
        }

        System.out.println("Hasil penjumlahan: " + total);

        input.close();
    }
}
