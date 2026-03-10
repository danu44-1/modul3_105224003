import java.util.Scanner;

public class latihan3 {
    public static void main(String[] args) throws Exception {
        for (int iter = 0; iter < 50; iter++) {
            if (iter % 3 == 0 || iter % 5 == 0) {
                continue;
            } else {
                System.out.println(iter);
            }
        }
    }
}
