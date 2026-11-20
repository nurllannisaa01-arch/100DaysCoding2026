import java.util.Scanner;

public class day80 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membuat array
        int[] angka = new int[5];

        // Memasukkan data ke array
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        // Mengakses elemen berdasarkan indeks
        System.out.println("\nData berdasarkan indeks:");

        System.out.println("Indeks 0: " + angka[0]);
        System.out.println("Indeks 1: " + angka[1]);
        System.out.println("Indeks 2: " + angka[2]);
        System.out.println("Indeks 3: " + angka[3]);
        System.out.println("Indeks 4: " + angka[4]);

        input.close();
    }
}
