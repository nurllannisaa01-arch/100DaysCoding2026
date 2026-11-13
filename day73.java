import java.util.Scanner;

public class day73 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Tampilkan Nama");
            System.out.println("2. Tampilkan Umur");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Nama: Andi");
                    break;

                case 2:
                    System.out.println("Umur: 20 Tahun");
                    break;

                case 3:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }

            System.out.println();

        } while (pilihan != 3);

        input.close();
    }
}
