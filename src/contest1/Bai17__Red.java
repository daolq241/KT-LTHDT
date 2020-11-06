package contest1;

import com.sun.org.apache.bcel.internal.generic.SWAP;
import java.util.Scanner;

/**
 *
 * @author Lê Quang Đạo
 */
public class Bai17__Red {

    static String s, Max;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, k;
        t = sc.nextInt();
        while (t-- > 0) {
            Bai17__Red bai17 = new Bai17__Red();
            k = sc.nextInt();
            sc.nextLine();
            s = sc.nextLine();
            char ch[] = s.toCharArray();

            Max = s;
//            System.out.println(s);
//            max = s;
            process(k);
            System.out.println(Max);
        }
    }

    private static void process(int k) {
        if (k == 0) {
            return;
        }
        int n = s.length();
        for (int i = 0; i < n - 1; i++) {
            char c = s.charAt(i);
            for (int j = i + 1; j < n; j++) {
                char d = s.charAt(j);
                if (d > c) {
                    char temp = d;
                    d = c;
                    c = temp;
                    if (s.compareTo(Max) > 0) {
                        Max = s;
                        System.out.println("..." + Max);
                    }
                    process(k - 1);
                    char temp2 = c;
                    c = d;
                    d = temp2;
                }
            }
        }
    }
}
