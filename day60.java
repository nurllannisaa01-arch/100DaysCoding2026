import java.util.Scanner;

public class day60 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int N = input.nextInt();

        int jumlah = 0;

        for (int i = 1; i <= N; i++) {
            jumlah += i;
        }

        System.out.println("Jumlah angka 1 sampai " + N + " = " + jumlah);
    }
}
