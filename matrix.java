import java.util.*;
class matrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the order of the matrix");
        n = sc.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] c = new int[n][n];
        System.out.println("enter the elements of the first matrix");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the elements of the second matrix");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                b[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("the sum of the two matrices is:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
