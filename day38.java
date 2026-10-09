import java.util.Scanner;

public class day38 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Goreng");
        System.out.println("3. Ayam Goreng");

        System.out.print("Pilih menu: ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Anda memilih Nasi Goreng");
        } else if (pilihan == 2) {
            System.out.println("Anda memilih Mie Goreng");
        } else if (pilihan == 3) {
            System.out.println("Anda memilih Ayam Goreng");
        } else {
            System.out.println("Menu tidak tersedia");
        }
    }
}
