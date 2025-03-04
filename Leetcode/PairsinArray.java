public class PairsinArray {
    public static void main(String[] args) {
        int arr[] = {2,3,5,7,9};
        int tp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
    }
}
