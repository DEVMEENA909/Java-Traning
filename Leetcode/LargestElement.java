public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,3,2,7,9,6};
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
               if(largest < arr[i]){
                largest = arr[i];
               }
            }
            System.out.println(largest);
        }
}
