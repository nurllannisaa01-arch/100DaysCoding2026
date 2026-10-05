public class day35 {
    
    public static void main(String[] args) {
        int umur = 18;
        boolean punyaKTP = true;

        if (umur >= 17) {
            if (punyaKTP) {
                System.out.println("Boleh membuat SIM");
            } else {
                System.out.println("Belum memiliki KTP");
            }
        } else {
            System.out.println("Umur belum cukup");
        }
    }
}
