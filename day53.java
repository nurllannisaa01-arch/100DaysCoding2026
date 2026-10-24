import java.util.Scanner;

public class day53 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int uang;
        int pilihan;

        do {
            System.out.print("Masukkan jumlah uang yang ditabung: ");
            uang = input.nextInt();

            total = total + uang;

            System.out.print("Ingin menabung lagi? (1 = Ya, 0 = Tidak): ");
            pilihan = input.nextInt();

        } while (pilihan == 1);

        System.out.println("Total tabungan Dwi: Rp" + total);
    }
}
