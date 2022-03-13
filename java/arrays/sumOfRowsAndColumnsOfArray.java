import java.util.Scanner;
public class array {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no of rows and columns");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] a = new int[m][n];
        System.out.println("Enter the elements");
        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("the array you inserted in is : ");

        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


        System.out.print("sum of rows: ");
        for(int i=0; i<n;i++){
            int sumOfRows=0;
            for(int j=0;j<n;j++){
               sumOfRows+=a[i][j];
            }
            System.out.print(sumOfRows+" ");
        }
        System.out.println();
        System.out.print("sum of columns: ");

        for(int j=0; j<n;j++){
            int sumOfColumns=0;
            for(int i=0;i<n;i++){
                sumOfColumns+=a[i][j];
            }
            System.out.print(sumOfColumns+" ");
        }
    }
}
