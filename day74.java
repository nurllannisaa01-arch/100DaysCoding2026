import java.util.Scanner;

public class day74 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String judul;
        int jumlahKarakter;

        System.out.print("Masukkan judul buku: ");
        judul = input.nextLine();

        System.out.println("Judul huruf kapital: " + judul.toUpperCase());
        System.out.println("Judul huruf kecil: " + judul.toLowerCase());

        jumlahKarakter = judul.length();

        System.out.println("Jumlah karakter: " + jumlahKarakter);

        if (jumlahKarakter > 20) {
            System.out.println("Judul buku cukup panjang");
        } else {
            System.out.println("Judul buku tidak terlalu panjang");
        }

        input.close();
    }
}
