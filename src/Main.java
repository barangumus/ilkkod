public class Main {
    public static void main(String[] args) {
        long toplam = 0;

        // 1'den 20'ye kadar olan sayıları döngüye alıyoruz
        for (int i = 1; i <= 20; i++) {
            // Sayının çift olup olmadığını kontrol ediyoruz
            if (i % 2 == 0) {
                // Çift sayının küpünü alıp toplama ekliyoruz
                toplam += (long) Math.pow(i, 3);
            }
        }
        System.out.println("1-20 arasındaki çift sayıların küplerinin toplamı: " + toplam);
    }
}