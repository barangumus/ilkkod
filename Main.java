public class Main {
    public static void main(String[] args) {
        
        long toplam = 0;
        
        for (int i = 1; i <= 20; i++) {
            
            if (i % 2 == 0) {               
                toplam += (long) Math.pow(i, 3);
            }
        }
        System.out.println("1-20 arasındaki çift sayıların küplerinin toplamı: " + toplam);
    }
}
