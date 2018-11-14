import java.util.Scanner;

public class CCF20180901 {

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] a= new int[n];
        int[] b= new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            b[i] = a[i];
        }
        a[0] = (a[0] + a[1]) / 2;
        a[n-1] = (a[n-1] + a[n-2]) / 2;
        for (int i = 1; i < n-1; i++) {
            a[i] = (b[i-1] + b[i] + b[i+1]) / 3;
        }
        for (int i = 0; i < n;  i++) {
            if (i == 0) {
                System.out.print(a[i]);
            }else {
                System.out.print(" " + a[i]);
            }
        }
    }
}
