import java.util.Scanner;

public class day52 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pin;

        System.out.print("Masukkan PIN: ");
        pin = input.nextInt();

        while (pin != 5421) {
            System.out.println("PIN salah!");
            System.out.print("Masukkan PIN kembali: ");
            pin = input.nextInt();
        }

        System.out.println("PIN benar, berhasil masuk!");

        input.close();
    }
}
