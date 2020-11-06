package contest1;

import java.util.Scanner;

/**
 * A/B = 1/X + A/(BX)
 * => X = B/A + 1
 * A = AX - B
 * B = BX
 *
 * @author Lê Quang Đạo
 */
public class Bai20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        long a, b;
        t = sc.nextInt();
        while (t-- > 0) {
            a = sc.nextLong();
            b = sc.nextLong();
            tachPhanSo(a, b);
            System.out.println("");
        }
    }

    private static void tachPhanSo(long a, long b) {
        if (b % a == 0) {
            System.out.print("1/" + b / a);
            return;
        } else {
            long temp = b / a + 1;
            System.out.print("1/" + temp + " + ");
            tachPhanSo(a * temp - b, b * temp);
        }
    }

}
