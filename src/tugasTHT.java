import java.util.Scanner;

public class tugasTHT {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int hargaVIP = 1500000, hargaFestival = 800000, hargaTribune = 500000;
        int total = 0;
        int stokV = 5, stokF = 25, stokT = 35;
        int pilih, terbeli = 0;

        do{
            System.out.println("\nSistem Tiket");
            System.out.println("\n1.VIP |2.Festival |3.Tribune ");
            System.out.print("Pilih : ");
            pilih = in.nextInt();

            int jumlah;
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Jumlah : ");
                    jumlah = in.nextInt();
 
                    if (jumlah < stokV){
                        for (int i = 0; i < jumlah; i++){
                            System.out.print("Masukkan Usia untuk tiket " + (i+1) + " : ");
                            int usia = in.nextInt();

                            if (usia == -1){
                                System.out.println("Batal darurat, stok telah dikembalikan");
                                jumlah--;
                                terbeli = 0;
                                total = 0;
                                break;
                            }

                            if (usia < 0 || usia > 100) {
                                System.out.println("Usia tidak logis");
                                i--;
                            } else {
                                if (usia >= 18){
                                    total += hargaVIP;
                                    System.out.println("Tiket berhasil dibeli");
                                    stokV--;
                                    terbeli++;
                                }else {
                                    System.out.println("Usia Tidak Mencukupi");
                                    continue;
                                }
                            }          
                        }
                    }else {
                        System.out.println("Hanya Tersisa "+ stokV +" stok");
                        break;
                    }
                    System.out.println("\n------- \nJumlah Tiket yang Dibeli : " + terbeli);
                    System.out.println("Harga Total : " + total);
                    total = 0;
                    break;

                case 2:
                    System.out.print("Masukkan Jumlah : ");
                    jumlah = in.nextInt();
 
                    if (jumlah < stokF){
                        for (int i = 0; i < jumlah; i++){
                            System.out.print("Masukkan Usia untuk tiket " + (i+1) + " : ");
                            int usia = in.nextInt();

                            if (usia == -1){
                                System.out.println("Batal darurat, stok telah dikembalikan");
                                jumlah--;
                                terbeli = 0;
                                total = 0;
                                break;
                            }

                            if (usia < 0 || usia > 100) {
                                System.out.println("Usia tidak logis");
                                i--;
                            } else {
                                if (usia >= 15){
                                    total += hargaFestival;
                                    System.out.println("Tiket berhasil dibeli");
                                    stokF--;
                                    terbeli++;
                                }else {
                                    System.out.println("Usia Tidak Mencukupi");
                                    continue;
                                }
                            }          
                        }
                    }else {
                        System.out.println("Hanya Tersisa "+ stokF +" stok");
                        break;
                    }
                    System.out.println("\n------- \nJumlah Tiket yang Dibeli : " + terbeli);
                    System.out.println("Harga Total : " + total);
                    total = 0;
                    break;

                case 3:
                    System.out.print("Masukkan Jumlah : ");
                    jumlah = in.nextInt();
 
                    if (jumlah < stokT){
                        for (int i = 0; i < jumlah; i++){
                            System.out.print("Masukkan Usia untuk tiket " + (i+1) + " : ");
                            int usia = in.nextInt();

                            if (usia == -1){
                                System.out.println("Batal darurat, stok telah dikembalikan");
                                jumlah--;
                                terbeli = 0;
                                total = 0;
                                break;
                            }

                            if (usia < 0 || usia > 100) {
                                System.out.println("Usia tidak logis");
                                i--;
                            } else {
                                if (usia >= 0){
                                    total += hargaTribune;
                                    System.out.println("Tiket berhasil dibeli");
                                    stokT--;
                                    terbeli++;
                                }else {
                                    System.out.println("Usia Tidak Mencukupi");
                                    continue;
                                }
                            }          
                        }
                    }else {
                        System.out.println("Hanya Tersisa "+ stokT +" stok");
                        break;
                    }
                    System.out.println("\n------- \nJumlah Tiket yang Dibeli : " + terbeli);
                    System.out.println("Harga Total : " + total);
                    total = 0;
                    break;
            
                default:
                    break;
            }
            terbeli = 0;


        }while(pilih != 4);

    }
}
