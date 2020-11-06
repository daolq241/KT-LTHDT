package contest1;

import static java.lang.Math.sqrt;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;
import javafx.scene.layout.Priority;

/**
 *
 * @author GiangPham
 */
public class T {

    public static void main(String[] args) {
 //=============Queue=================
//        Queue<Integer> q = new LinkedList<>();
//        q.add(3);
//        q.add(5);
//        q.add(10);
//        q.add(2);
//        q.poll();
//        System.out.println(q);
//=============  PriorityQueue===============
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(5);
        q.add(1);
        q.add(3);
        q.add(10);
//        q.poll(); // Xoa bo phan tu dau queue, va sort queue
           
        
        System.out.println(q);
//================Vector=======================
//        int a[] = new int[]{1, 2, 3, 4};
//        Vector<Integer> v = new Vector<Integer>();
//        v.add(9);
//        v.add(5);
//        v.add(2);
//        v.add(4);
//        System.out.println(v);
//        Collections.sort(v);
//        System.out.println(v);
//
//        v.remove(1);
////        v.remove(0);
//        v.add(100);
//        System.out.println(v);
//================ Stack===============
//        Stack<Integer> st = new Stack<>();
//        st.push(1);
//        st.push(2);
//
//        st.push(3);
//
//        st.push(4);
//        st.push(5);
//        st.pop();
//        System.out.println(st.peek());
//        for (Integer integer : st) {
//            System.out.print(integer + " ");
//        }
//=============================
//        long n;
//        int t;
//        Scanner sc = new Scanner(System.in);
//        t = sc.nextInt();
//         while(t!=0){
//             n = sc.nextLong();
//             t--;
//             long max=0;
////             long tmp =n;
//             while(n%2==0){
//                 max=2;
//                 n/=2;
//             }
//             for(long i=3;i<=sqrt(n);i+=2){
//                 while(n%i==0){
//                     n/=i;
//                      max =i;
//                 }
//                
//             }
//            if(n>2) max = n;
//            System.out.println(max);
//        }
    }
}
