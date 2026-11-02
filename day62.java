import java.util.Scanner;

public class day62 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa (M): ");
        int M = input.nextInt();

        System.out.print("Masukkan jumlah laporan per mahasiswa (N): ");
        int N = input.nextInt();

        System.out.println("\n--- DAFTAR TUGAS MAHASISWA ---");

        for (int mahasiswa = 1; mahasiswa <= M; mahasiswa++) {
            System.out.println("Mahasiswa ke-" + mahasiswa + ":");

            for (int laporan = 1; laporan <= N; laporan++) {
                System.out.println("   - Laporan " + laporan);
            }

            System.out.println();
        }

        input.close();
    }
}
