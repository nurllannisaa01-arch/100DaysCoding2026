import java.util.Scanner;
public class day48 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Angka 1: ");
        int a = input.nextInt();

        System.out.print("Operator (+, -, *, /): ");
        char op = input.next().charAt(0);

        System.out.print("Angka 2: ");
        int b = input.nextInt();

        switch (op) {
            case '+':
                System.out.println("Hasil = " + (a + b));
                break;
            case '-':
                System.out.println("Hasil = " + (a - b));
                break;
            case '*':
                System.out.println("Hasil = " + (a * b));
                break;
            case '/':
                System.out.println("Hasil = " + (a / b));
                break;
            default:
                System.out.println("Operator salah");
        }
    }
}
