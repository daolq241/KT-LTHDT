package contest2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Lê Quang Đạo
 */


// Dang TLE
public class Bai52Sai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        long n;
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextLong();
            System.out.println(process(n));
        }
    }

    private static long process(long n) {
        Queue<Long> q = new LinkedList<>();
        q.add((long) 1);
        int dem  = 0;
        long t;
        while (q.size() > 0) {
            t = q.peek();
            q.remove();
            if (t <= n) {
                dem++;
                q.add(t * 10);
                q.add(t * 10 + 1);
            }
        }
        return dem;
    }
}
