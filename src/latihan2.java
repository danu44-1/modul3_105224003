import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int percobaan = 0;
        while (percobaan != 3) {
            System.out.print("Masukkan PIN (6 angka) : ");
            int pin = in.nextInt();
            if (pin == 123456) {
                System.out.print("Berhasil memasukkan PIN");
                break;
            } else {
                if (percobaan != 3) {
                    System.out.println("Coba lagi");
                } else {
                    break;
                }
            }
            percobaan++;
        }
        System.out.println("Akun diblokir");

        in.close();
    }
}
