public class BubbleSort {
    public static void main(String [] args){
        int [] a = new int[]{7,5,4,1,-1};
        int n = a.length;
        boolean swap = true;
        int temp = 0;
        for (int i =0; i<=n-1;i++){
            
            for (int j=0;j<n-i;j++){
                if (a[i]>a[j]){
                    a[i]=temp;
                    a[j]=a[i];
                    a[j]=temp;
                    swap = false;
                }
                if (swap = true){
                    break;
                }
            }
        }
        for (int item: a){
            System.out.print(item+" ");
        }
    }
}
