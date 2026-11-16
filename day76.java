import java.util.Scanner;

public class day76 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kode;

        System.out.print("Masukkan kode mahasiswa: ");
        kode = input.nextLine();

        // Menghilangkan spasi awal dan akhir
        String bersih = kode.trim();

        // Mengganti tanda - menjadi /
        String ganti = bersih.replace("-", "/");

        // Mengambil 9 karakter pertama
        String hasil = ganti.substring(0, 9);

        // Menampilkan hasil
        System.out.println("Kode awal: " + kode);
        System.out.println("Kode setelah trim: " + bersih);
        System.out.println("Kode setelah replace: " + ganti);
        System.out.println("9 karakter pertama: " + hasil);

        input.close();
    }
}
