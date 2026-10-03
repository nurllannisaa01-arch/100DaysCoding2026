public class day32 {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Operator aritmatika
        int hasil = a + b * 2;

        // Operator perbandingan
        boolean perbandingan = hasil > 15;

        // Operator logika
        boolean logika = (a > b) && (hasil > 15);

        // Operator penugasan
        a += 2;

        System.out.println("Hasil aritmatika: " + hasil);
        System.out.println("Hasil perbandingan: " + perbandingan);
        System.out.println("Hasil logika: " + logika);
        System.out.println("Nilai a setelah += 2: " + a);
    }
}
