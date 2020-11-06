import java.util.Scanner;
public class test1 {
    static int res = 0;
    static boolean Ok(int[] a,int x2,int y2){
        for(int i = 1; i < x2 ;i++)
            if(a[i] == y2 || Math.abs(i-x2) == Math.abs(a[i] - y2) )
                return false;
        return true;
    }
    static void Try(int[] a,int i,int n){
        for(int j = 1;j<=n;j++){
            if(Ok(a,i,j)){
                a[i] = j;
                if(i==n) res++;
                Try(a,i+1,n);
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0){
            int n = in.nextInt();
            res = 0;
            int[] arr = new int[n+1];
            Try(arr,1,n);
            System.out.println(res);
        }
    }
}