public class Practic {

    //--- Two pointers ---------
    public static void reverse(int[] arr){
        int i =0, j=arr.length-1; 
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }

         public static void main(String[] args) {
            int arr []= {-1,5,6,0,10,2};
            reverse(arr);

         }
}
