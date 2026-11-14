import java.util.Scanner;

public class day75 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username, password, prodi;

        System.out.print("Masukkan username: ");
        username = input.nextLine();

        System.out.print("Masukkan password: ");
        password = input.nextLine();

        System.out.print("Masukkan program studi: ");
        prodi = input.nextLine();

        // Mengecek username
        if (username.isEmpty()) {
            System.out.println("Username wajib diisi");
        }

        // Mengecek password
        if (password.equals("Java123")) {
            System.out.println("Password benar");
        }

        // Mengecek program studi
        if (prodi.equalsIgnoreCase("informatika")) {
            System.out.println("Program studi sesuai");
        }

        // Mengecek kata Teknik
        if (prodi.contains("Teknik")) {
            System.out.println("Berada di Fakultas Teknik");
        }

        // Mengecek login
        if (!username.isEmpty() && 
            !password.isEmpty() && 
            password.equals("Java123")) {

            System.out.println("Login berhasil");

        } else {
            System.out.println("Login gagal");
        }

        input.close();
    }
}
