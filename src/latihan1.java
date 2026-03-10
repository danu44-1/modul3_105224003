import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka desimal A : ");
        float angkaA = in.nextFloat();

        System.out.print("Masukkan angka desimal B : ");
        float angkaB = in.nextFloat();

        System.out.print("Masukkan Karakter operator matematika : ");
        char op = in.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Hasilnya : " + (angkaA + angkaB));
                break;

            case '-':
                System.out.println("Hasilnya : " + (angkaA - angkaB));
                break;

            case '*':
                System.out.println("Hasilnya : " + (angkaA * angkaB));
                break;

            case '/':
                if (angkaB == 0) {
                    System.out.println("Error: Pembagian dengan nol tidak diizinkan");

                } else {
                    System.out.println("Hasilnya : " + (angkaA / angkaB));

                }
                break;

            default:
                break;
        }

        System.out.println();
    }
}
