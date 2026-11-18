import java.util.Scanner;

public class day78 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username, password;
        String userLogin, passLogin;

        // Membuat akun
        System.out.println("=== MEMBUAT AKUN ===");

        System.out.print("Buat Username: ");
        username = input.nextLine();

        System.out.print("Buat Password: ");
        password = input.nextLine();

        System.out.println("\nAkun berhasil dibuat!");

        // Login ke akun
        System.out.println("\n=== LOGIN AKUN ===");

        do {
            System.out.print("Masukkan Username: ");
            userLogin = input.nextLine();

            System.out.print("Masukkan Password: ");
            passLogin = input.nextLine();

            if (!userLogin.equals(username) ||
                !passLogin.equals(password)) {

                System.out.println("Username atau Password salah!");
                System.out.println("Silakan coba lagi.\n");

            }

        } while (!userLogin.equals(username) ||
                 !passLogin.equals(password));

        System.out.println("\nLogin berhasil!");
        System.out.println("Selamat datang, " + username);

        input.close();
    }
}
