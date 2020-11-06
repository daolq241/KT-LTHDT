package contest1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Lê Quang Đạo
 */
public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        long n;
        t = sc.nextInt();
        while(t-->0) {
            n = sc.nextLong();
            System.out.println((findMaxPrime(n)));
        }
    }
    static long findMaxPrime(long n) {
        long maxPrime = 0;
        while(n%2 == 0) {
            maxPrime = 2;
            n /= 2;
        }
        for(int i = 3; i <= sqrt(n); i = i+2) {
            while(n % i == 0) {
                n = n/i;
                maxPrime = i;
            }
        }
        if(n > 2) maxPrime = n;
        return maxPrime;
    }
}
