package contest1;

import java.util.Scanner;

/**
 *
 * @author Lê Quang Đạo
 */
public class Bai23__Red {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, n, s;
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            s = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            process(a, n, s);
            System.out.println("");
        }
    }

    private static void process(int[] a, int n, int s) {
        boolean check = false;
        for (int i = 1; i <= n; i++) {
            boolean stop = false;
            int b[] = new int[i] ;
		for (int j = 0; j < i; j++) {
                b[j] = j + 1;
            }
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += a[b[j] - 1];
            }
            if (sum == s) {
                check = true;
                System.out.print(i);
                break;
            } else {
                while (stop == false) {
                    int j = i - 1;
                    while (b[j] == n - i + j + 1) {
                        j--;
                    }

                    if (j < 0) {
                        stop = true;
                        break;
                    } else {
                        b[j]++;

                        for (int k = j + 1; k < i; k++) {
                            b[k] = b[j] + (k + 1) - (j + 1);
                        }
                    }

                    sum = 0;
                    for (int k = 0; k < i; k++) {
                        sum += a[b[k] - 1];
                    }

                    if (sum == s) {
                        check = true;
                        System.out.print(i);
                        break;
                    }
                }
            }
            if (check == true) {
                break;
            }
        }
    }
}
