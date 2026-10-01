public class day31 {
    
    public static void main(String[] args) {
        int umur = 20;
        boolean punyaKTP = true;

        // AND (&&)
        System.out.println("AND: " + (umur >= 17 && punyaKTP));

        // OR (||)
        System.out.println("OR: " + (umur >= 17 || punyaKTP));

        // NOT (!)
        System.out.println("NOT: " + (!punyaKTP));
    }
}
