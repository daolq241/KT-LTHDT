package contest2;

import java.util.Scanner;

/**
 *
 * @author Lê Quang Đạo
 */
public class Bai36 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        long n, k;
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextLong();
            k = sc.nextLong();
            if(k%2 == 1) System.out.println("1");
            else System.out.println(process(n, k));
        }
    }

    private static long process(long n, long k) {
        long temp = (long) (Math.pow(2, n) / 2);
        if (k == temp) {
            return n;
        }
        if (k < temp) {
            return process(n - 1, k);
        }
        return process(n - 1, k - temp);

    }
}
/*
nhan xet: if k = temp => return n
n = 1; 1    ; temp = 1;
n = 2; 1 2 1; temp = 2;
n = 3; 121 3 121; temp = 4
n = 4; 1213121 4 1213121; temp = 8
*/
