import java.util.Scanner;


public class day12 {
    
    public static void main(String[] args) {
        
    
    Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Masukkan nilai: ");
        double nilai = input.nextDouble();

        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("Nama  : " + nama);
        System.out.println("Umur  : " + umur);
        System.out.println("Nilai : " + nilai);

        input.close();
    }
}

