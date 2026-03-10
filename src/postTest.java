import java.util.Scanner;

public class postTest {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int pilih;
        int saldo = 500000;
        do {
            System.out.println("Menu: 1. Cek Saldo |2. Setor Tunai |3. Tarik Tunai |4. Keluar");
            System.out.print("Pilih : ");
            pilih = in.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Saldo anda : " + saldo);
                    break;
                case 2:
                    System.out.print("Setor Sebesar : ");
                    int tambah = in.nextInt();

                    System.out.println("Saldo anda sekarang : " + (saldo + tambah));
                    break;
                case 3:
                    System.out.print("Tarik Sebanyak : ");
                    int kurang = in.nextInt();

                    if (saldo - kurang <= 50000) {
                        System.out.println("Penarikan gagal, tidak boleh membuat saldo kurang dari 50.000");
                    } else {
                        System.out.println("Saldo anda : " + (saldo - kurang) + ", dikurang sebesar : " + kurang);
                    }
                    break;
                case 4:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Coba lagi, menu input salah");
                    break;
            }
        } while (pilih != 4);

        in.close();
    }
}
