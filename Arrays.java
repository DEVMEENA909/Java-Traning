public class Arrays {
    public static void update(int arr[],int val ){
        for(int i=0;i<arr.length;i++){
            val = 30;
            arr[i] = arr[i] + 12; 
        }
    }
    public static void main(String[] args) {

        int arr[] = {10,20,30};
        int val = 5;
        update(arr,val);
        System.out.println(val);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
