import java.util.Scanner;

public class day79 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilai = new int[5];
        int total = 0;
        double rataRata;

        // Memasukkan nilai
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nilai mata kuliah ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();

            total += nilai[i];
        }

        // Menghitung rata-rata
        rataRata = total / 5.0;

        // Menampilkan seluruh nilai
        System.out.println("\n=== HASIL NILAI ===");

        for (int i = 0; i < 5; i++) {
            System.out.println("Nilai mata kuliah ke-" + (i + 1) + ": " + nilai[i]);
        }

        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata nilai: " + rataRata);

        input.close();
    }
}
