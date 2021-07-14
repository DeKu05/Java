import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Students");
        int n = sc.nextInt();
        int sum=0;
        float avgMarks = 0f;
        int[] MarksOfStudent = new int[n];
        System.out.println("Enter The Marks Of Students");
        for (int i=0; i<n;i++){
           MarksOfStudent[i]= sc.nextInt();
           sum += MarksOfStudent[i];
        }

        avgMarks = sum/n;
            System.out.println(" Average marks of the Students are : "+ avgMarks);
    }
}