import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bakiye = 1000;

        System.out.println("ATM'ye Hoş Geldiniz!");
        System.out.println("1. Para Çekme");
        System.out.println("2. Para Yatırma");
        System.out.println("3. Bakiye Sorgulama");
        System.out.println("4. Çıkış");

        int secim = scanner.nextInt();

        while (secim != 4) {
            switch (secim) {
                case 1:
                    System.out.print("Çekmek istediğiniz miktarı girin: ");
                    double miktarCek = scanner.nextDouble();
                    if (miktarCek > bakiye) {
                        System.out.println("Yetersiz bakiye!");
                    } else {
                        bakiye -= miktarCek;
                        System.out.println("Para çekme işlemi gerçekleştirildi. Güncel bakiye: " + bakiye);
                    }
                    break;
                case 2:
                    System.out.print("Yatırmak istediğiniz miktarı girin: ");
                    double miktarYatir = scanner.nextDouble();
                    bakiye += miktarYatir;
                    System.out.println("Para yatırma işlemi gerçekleştirildi. Güncel bakiye: " + bakiye);
                    break;
                case 3:
                    System.out.println("Güncel bakiye: " + bakiye);
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
                    break;
            }

            System.out.println("\n1. Para Çekme");
            System.out.println("2. Para Yatırma");
            System.out.println("3. Bakiye Sorgulama");
            System.out.println("4. Çıkış");

            secim = scanner.nextInt();
        }

        System.out.println("Çıkış yapılıyor. AKKAN BANKA İyi günler diler!");

        scanner.close();
    }
}
