public class day02{
    public static void main(String[] args) {
        String nama = "nurul";
        String alamat = "rangas";
        String jurusan = "informatika";
        int umur = 18;
        double ipk = 3.17;
        
        //menggunakan println
        System.out.println ("biodata diri");
        //menggunakan print
        System.out.print("Nama Lengkap: ");
        System.out.print(nama);
        
        System.out.print("tempat tinggal: ");
        System.out.print(alamat);
        
        //menggunakan printf
        System.out.printf("Umur : %d tahun\n", umur);
        System.out.printf("IPK : %.2f\n", ipk);
        
    }
    
}
