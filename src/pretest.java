import java.util.Scanner;

public class pretest {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Usia : ");
        int usia = input.nextInt();

        System.out.print("Masukkan Berat badan : ");
        float berat = input.nextFloat();

        System.out.print("Masukkan Kadar Hemoglobin : ");
        float kadar = input.nextFloat();

        if (usia >= 18.0) {
            if (berat <= 130.0) {
                if (kadar >= 12.5) {
                    System.out.println("Anda Diterima Menjadi Pendonor");
                } else {
                    System.out.println("Kadar anda Kurang");
                }
            } else {
                System.out.println("Berat anda berlebihan, tolong periksakan diri Anda");
            }
        } else {
            System.out.println("Anda tidak memenuhi protokol pendonor");

        }

        input.close();

    }
}
