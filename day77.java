import java.util.Scanner;

public class day77 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;

        System.out.print("Masukkan nama: ");
        nama = input.nextLine();

        System.out.println("\n=== HASIL METHOD STRING ===");

        // Mengubah menjadi huruf besar
        System.out.println("Huruf besar: " + nama.toUpperCase());

        // Mengubah menjadi huruf kecil
        System.out.println("Huruf kecil: " + nama.toLowerCase());

        // Menghitung jumlah karakter
        System.out.println("Jumlah karakter: " + nama.length());

        // Menghilangkan spasi di awal dan akhir
        System.out.println("Setelah trim: " + nama.trim());

        // Mengambil karakter pertama
        System.out.println("Karakter pertama: " + nama.charAt(0));

        // Mengganti huruf
        System.out.println("Mengganti a menjadi o: " + nama.replace('a', 'o'));

        // Memeriksa isi teks
        System.out.println("Apakah mengandung huruf A: " + nama.contains("A"));

        // Mengambil sebagian teks
        if (nama.length() >= 3) {
            System.out.println("Substring: " + nama.substring(0, 3));
        }

        input.close();
    }
}
