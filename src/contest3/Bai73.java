package contest3;

import java.util.Scanner;

/**
 *
 * @author Lê Quang Đạo
 */
// XEM PHIM
public class Bai73 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c, n;
        c = sc.nextInt();
        n = sc.nextInt();
        int a[] = new int[105];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
//        process(a, c, n);
        boolean f[][] = new boolean[105][25005];
        // Fij = true neu co cach chon i con bo dau tien co khoi luong = j
        f[0][0] = true;
        for (int i = 1; i <= c; i++) {
            f[0][i] = false;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= c; j++) {
                if (j < a[i]) {
                    f[i][j] = f[i - 1][j];
                } else {
                    f[i][j] = f[i - 1][j] || f[i - 1][j - a[i]];
                }
            }
        }
        for (int i = c; i >= 0; i--) {
            for (int j = 1; j <= n; j++) {
                if (f[j][i]) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }

//    private static void process(int[] a, int c, int n) {
//        boolean f[][] = new boolean[105][25005];
//        // Fij = true neu co cach chon i con bo dau tien co khoi luong = j
//        f[0][0] = true;
//        for (int i = 1; i <= c; i++) {
//            f[0][i] = false;
//        }
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= 10; j++) {
//                if (j < a[i]) {
//                    f[i][j] = f[i - 1][j];
//                } else {
//                    f[i][j] = f[i - 1][j] || f[i - 1][j - a[i]];
//                }
//            }
//        }
//        for (int i = c; i >= 0; i--) {
//            for (int j = 1; j <= n; j++) {
//                if (f[j][i]) {
//                    System.out.println(i);
//                }
//            }
//        }
//
////    }
//    }
}
