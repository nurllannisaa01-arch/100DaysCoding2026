import java.util.Scanner;

public class day55 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan nilai mahasiswa (-1 untuk berhenti): ");
            int nilai = input.nextInt();

            // Jika -1, hentikan perulangan
            if (nilai == -1) {
                break;
            }

            // Jika nilai tidak valid
            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid!");
                continue;
            }

            // Jika nilai 40, langsung mengakhiri program
            if (nilai == 40) {
                System.out.println("Program dihentikan karena nilai 40 ditemukan!");
                return;
            }

            // Jika nilai valid
            System.out.println("Nilai mahasiswa: " + nilai);
        }

        System.out.println("Pemeriksaan nilai selesai!");
    }
}
