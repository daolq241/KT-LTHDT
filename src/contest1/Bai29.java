package contest1;
import java.util.*;

public class Bai29 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0){
            int k = in.nextInt();
            in.nextLine();
            String s = in.nextLine();
            int[] count = new int[26];
            for (int i = 0; i < s.length(); i++){
                count[s.charAt(i) - 'A']++;
            }
            PriorityQueue<Integer> queue = new PriorityQueue<>(26, Collections.reverseOrder());
            for (int i : count){
                queue.add(i);
            }
            while (k-- > 0){
                int temp = queue.poll();
                temp --;
                queue.add(temp);
            }
            long res = 0;
            while (!queue.isEmpty()){
                int temp = queue.poll();
                res += temp*temp;
            }
            System.out.println(res);
        }
    }
}