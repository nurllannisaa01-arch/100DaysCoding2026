import java.util.Scanner;

public class day83 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];
        int total = 0;

        // Memasukkan elemen array
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        // Menjumlahkan elemen array
        for (int i = 0; i < 5; i++) {
            total = total + angka[i];
        }

        System.out.println("Total jumlah elemen array = " + total);

        input.close();
    }
}
