public class SelectionSort {
    public static void main(String [] args){
        int [] a = new int[]{69,21,17,99,101};
        int n = a.length;
        int temp =0;
        for (int i=0;i<n;i++){
            int minInd=i;
            for (int j=i;j<n;j++){
                if (a[j]<a[i]){
                    minInd=j;
                    }
                }
            temp=a[i];
            a[i]=a[minInd];
            a[minInd]=temp;
            }
        for (int item: a){
            System.out.print(item+" ");
        }
    }
}