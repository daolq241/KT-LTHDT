package contest1;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Lê Quang Đạo
 */
public class Bai10 {

//    static int n;
//    static int[] x = new int[100];
//    static boolean OK = true;
//    static Vector<String> v = new Vector<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test;
        test = sc.nextInt();
        int n;
        int[] x = new int[100];
        while (test-- > 0) {
//            init();
            Vector<String> v = new Vector<>();
            n = sc.nextInt();
            boolean OK = true;
            for (int i = 1; i <= n; i++) {
                x[i] = i;
            }
            while (OK == true) {
//                result();
                String s = "";
                for (int i = 1; i <= n; i++) {
//            System.out.print(x[i] + " ");
                    s += String.valueOf(x[i]);
                }
                v.add(s);

//                nextPermutation();
                int j = n - 1;
                while (j > 0 && x[j] > x[j + 1]) {
                    j--;
                }
                if (j > 0) {
                    // Tim cau hinh ke tiep
                    int k = n;
                    while (x[j] > x[k]) {
                        k--;
                    }
                    int t = x[j];
                    x[j] = x[k];
                    x[k] = t;

                    int r1 = j + 1, s1 = n;
                    while (r1 <= s1) {
                        t = x[r1];
                        x[r1] = x[s1];
                        x[s1] = t;
                        r1++;
                        s1--;
                    }
                } else {
                    OK = false;
                }
            }
            Collections.reverse(v);
            for (int i = 0; i < v.size(); i++) {
                System.out.print(v.get(i) + " ");
            }
            System.out.println("");
        }

    }
}

//    private static void init() {
////        Scanner sc = new Scanner(System.in);
////        System.out.print("Nhap n= ");
////        n = sc.nextInt();
////        for (int i = 1; i <= n; i++) {
////            x[i] = i;
////        }
//    }
//    private static void result() { // In ra cấu hình hiện tại
////        System.out.print("Kết quả " + ++dem + ": ");\
//        String s = "";
//        for (int i = 1; i <= n; i++) {
////            System.out.print(x[i] + " ");
//            s += String.valueOf(x[i]);
//        }
//        v.add(s);
////        System.out.println("");
//    }
//    private static void nextPermutation() {
//        int j = n - 1;
//        while (j > 0 && x[j] > x[j + 1]) {
//            j--;
//        }
//        if (j > 0) {
//            // Tim cau hinh ke tiep
//            int k = n;
//            while (x[j] > x[k]) {
//                k--;
//            }
//            int t = x[j];
//            x[j] = x[k];
//            x[k] = t;
//
//            int r = j + 1, s = n;
//            while (r <= s) {
//                t = x[r];
//                x[r] = x[s];
//                x[s] = t;
//                r++;
//                s--;
//            }
//        } else {
//            OK = false;
//        }
//
//    }
//
//}
