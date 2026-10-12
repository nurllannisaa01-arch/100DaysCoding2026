import java.util.Scanner;

public class day41 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan temperatur ruangan: ");
        int suhu = input.nextInt();

        if (suhu >= 30) {
            System.out.println("Ruangan panas");
        }

        if (suhu < 30) {
            System.out.println("Ruangan sejuk");
        }
    }
}
