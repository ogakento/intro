import java.util.Scanner;

public class C {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        for (int i = 0; i < M; i++) {
            int A[] = new int[M-1];
            int B[] = new int[M-1];
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }

    }
    
}
