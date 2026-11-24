import java.util.Scanner;

public class day84 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];

        // Memasukkan elemen array
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        // Menentukan angka maksimal
        int maksimal = angka[0];

        for (int i = 1; i < 5; i++) {
            if (angka[i] > maksimal) {
                maksimal = angka[i];
            }
        }

        System.out.println("Angka terbesar adalah: " + maksimal);

        input.close();
    }
}
