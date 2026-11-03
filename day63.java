import java.util.Scanner;

public class day63 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan M: ");
        int M = input.nextInt();

        System.out.print("Masukkan N: ");
        int N = input.nextInt();

        int hasil = 1;

        for (int i = 1; i <= N; i++) {
            hasil = hasil * M;
        }

        System.out.println("Hasil " + M + " pangkat " + N + " = " + hasil);
    }
}
