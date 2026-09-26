import java.util.Scanner;

public class day25 {
    
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("masukkan jari-jari lingkaran :");
        double lingkaran= i.nextDouble();
        double luas=Math.PI * lingkaran * lingkaran;
        System.out.println("luas lingkaran ="+luas);
    }
    
}
