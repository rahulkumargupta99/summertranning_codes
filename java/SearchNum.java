public class SearchNum {
    public static void main(String[] args) {
        int arr []= {1,3,9,11,3,6,12,16,9,7,6,20,8,16,};
        BinarySearch bs= new BinarySearch();
        System.out.print(arr[bs.lowerBound(arr,10)]);
    }
}
