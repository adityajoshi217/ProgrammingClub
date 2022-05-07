public class ReverseArray {
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5};

        // int j=arr.length-1;
        int temp=0;

        for (int i = 0; i<arr.length/2; i++) {
            temp=arr[i];
            arr[i]=arr[4-i];
            arr[4-i]=temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
