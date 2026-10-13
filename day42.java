import java.util.Scanner;

public class day42 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = input.nextDouble();

        System.out.print("Masukkan tunjangan: ");
        double tunjangan = input.nextDouble();

        System.out.print("Masukkan potongan: ");
        double potongan = input.nextDouble();

        double gajiBersih = gajiPokok + tunjangan - potongan;

        System.out.println("Gaji bersih = " + gajiBersih);
    }
}
