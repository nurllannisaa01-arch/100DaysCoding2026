package 100DaysofCoding;

public class Day02 {
    
    public static void main(String[] args) {
       String nama ="nurul";
        String tempatLahir= "rangas";
        String tanggalLahir="26 january 2008";
        int umur = 18;
        double tb = 153.7;
        boolean sayaWanita = true;
        //menggunakan println()
       System.out.println("nama lengkap:"+ nama);
        //menggunakan print()
        System.out.print("ttl  :");
        System.out.print(tempatLahir+",");
        System.out.print(tanggalLahir+"\n");
        //menggunakan printf()
        System.out.printf("umur  :%d tahun\n", umur);
        System.out.printf("tinggi badan  :%1.f cm\n", tb);
        System.out.printf("saya wanita  :%b\n", sayaWanita);
        
    }
    
}
