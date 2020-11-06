package contest2;

import java.util.Scanner;

/**
 *
 * @author Lê Quang Đạo
 */
public class Bai39 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        sc.nextLine();
        String s;
        while (t-- > 0) {
            s = sc.nextLine();
            String temp[] = s.split(" ");
            String ans = "";
            for (String string : temp) {
                StringBuffer s1 = new StringBuffer(string);
                ans += s1.reverse().toString() + " ";
            }
            
            System.out.println(ans);
            
        }

    }
}
