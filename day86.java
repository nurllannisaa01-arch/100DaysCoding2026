import java.util.Scanner;

public class day86 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];

        // Mengisi array
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        // Mencari angka
        System.out.print("Masukkan angka yang dicari: ");
        int cari = input.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < 5; i++) {
            if (angka[i] == cari) {
                ditemukan = true;
                System.out.println("Angka ditemukan pada indeks: " + i);
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Angka tidak ditemukan!");
        }

        input.close();
    }
}
