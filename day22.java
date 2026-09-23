public class day22 {
    
    public static void main(String[] args) {
        int angka1=26;
        int angka2=13;
        System.out.println("sebelum di tukar:");
        System.out.println("angka1= "+angka1);
        System.out.println("angka2= "+angka2);
        int temp=angka1;
        angka1=angka2;
        angka2=temp;
        System.out.println("\nsetelah ditukar:");
        System.out.println("angka1= "+angka1);
        System.out.println("angka2= "+angka2);
    }
    
}
