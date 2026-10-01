public class Main {
    public static void main(String[] args) {

        int toplam = 0;

        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 0) {
                toplam = toplam + (i * i * i);
            }
        }

        System.out.println("Çift sayıların küpleri toplamı: " + toplam    );
    }
}