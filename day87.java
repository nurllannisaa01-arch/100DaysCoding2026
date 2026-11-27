import java.util.Scanner;

public class day87 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];

        // Mengisi array
        System.out.println("Masukkan 5 angka:");

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        // Menampilkan data awal
        System.out.println("\nData Awal:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Indeks " + i + " = " + angka[i]);
        }

        // Mengubah data array
        System.out.print("\nMasukkan indeks yang ingin diubah: ");
        int indeks = input.nextInt();

        System.out.print("Masukkan angka baru: ");
        int baru = input.nextInt();

        angka[indeks] = baru;

        // Menampilkan data setelah diubah
        System.out.println("\nData Setelah Diubah:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Indeks " + i + " = " + angka[i]);
        }

        input.close();
    }
}
