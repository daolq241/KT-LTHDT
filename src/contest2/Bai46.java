package contest2;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Lê Quang Đạo
 */
public class Bai46 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        String s;
        sc.nextLine();
        while (t-- > 0) {
            s = sc.nextLine();
            System.out.println(process(s));
        }
    }

    private static int process(String s) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isOperator(c)) {
                int b = st.pop();
                int a = st.pop();
                if (c == '+') {
                    st.push(a + b);
                } else if (c == '-') {
                    st.push(a - b);
                } else if (c == '*') {
                    st.push(a * b);
                } else if (c == '/') {
                    st.push(a / b);
                }
            } else {
                st.push(c - '0');
            }
        }
        return st.peek();
    }

    private static boolean isOperator(char c) {
        if (c == '+') {
            return true;
        } else if (c == '-') {
            return true;
        } else if (c == '*') {
            return true;
        } else if (c == '/') {
            return true;
        }
        return false;
    }
}
