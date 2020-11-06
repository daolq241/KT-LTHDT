package contest1;

import java.util.Scanner;

/**
 *
 * @author Lê Quang Đạo
 */
public class Bai5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        sc.nextLine();
        String s;
        while (t > 0) {
            t--;
            s = sc.nextLine();
            System.out.println(chuanHoa(s));
        }
    }

    public static String chuanHoa(String s) {
        String result = "";
        s = s.replaceAll("\\s+", " ");
        s = s.trim();
        String s1[] = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            result += String.valueOf(s1[i].charAt(0)).toUpperCase()
                    + String.valueOf(s1[i].substring(1)).toLowerCase();
            if (i < s1.length - 1) {
                result += " ";
            }
        }
        return result;
    }

}
