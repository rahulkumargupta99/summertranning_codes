import java.util.*;

public class Sorting {

    // ------Bubbble sort ------
    // swap
    // public static void swap(int [] arr, int i, int j){
    // int temp = arr[i];
    // arr [i] = arr[j];
    // arr [j] = temp;
    // }
    // // for each loop
    // static void printArr(int[] arr){
    // for(int i:arr)
    // System.out.println(i+ " ");
    // System.out.println();
    // }
    // //---logic----
    // public static void bubbleShort(int[] arr){
    // for(int turn =1; turn<arr.length; turn++){
    // for(int i=0; i<arr.length-turn; i++){
    // if(arr[i]>arr[i+1])
    // swap(arr, i, i+1);
    // }
    // }
    // }
    // //main functioon
    // public static void main(String[] args) {
    // int arr []= {2,4,1,3,8,5,9};
    // bubbleShort(arr);
    // printArr(arr);
    // }

    // //------Selection sort ------
    // public static void swap(int[] arr, int i, int j){
    // int temp = arr[i];
    // arr[i] = arr[j];
    // arr[j] = temp;
    // }
    // // for each loop
    // static void printArr(int[] arr){
    // for(int i:arr)
    // System.out.println(i+ " ");
    // System.out.println();
    // }

    // //logic
    // public static void selectionsort(int [] arr){
    // for(int i=0; i<arr.length; i++){
    // int idx = minIdx(arr, i);
    // swap(arr,i,idx);
    // }
    // }
    // public static int minIdx(int[] arr, int i){
    // int minIndex =i;
    // for(int j= i+1; j<arr.length-1; j++){
    // if(arr[j]<arr[minIndex])
    // minIndex=j;
    // }
    // return minIndex;
    // }
    // // main function
    // public static void main(String[] args) {
    // int arr [] = {2,4,1,3,8,5,9,11};
    // selectionsort(arr);
    // printArr(arr);

    // }

    // ================ INSERTION SORT =====================================

    // Swap
    // public static void swap(int[] arr, int i, int j) {
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    // }

    // // For Each Loop
    // static void printArr(int[] arr) {
    //     for (int i : arr)
    //         System.out.println(i + " ");
    //     System.out.println();
    // }

    // // logic

    // public static void insertionSort(int[] arr) {
    //     int n = arr.length;
    //     for (int i = 1; i < n; i++) {
    //         int key = arr[i];
    //         int j = i - 1;
    //         while (j >= 0 && arr[j] > key) {
    //             arr[j + 1] = arr[j];
    //             j--;
    //         }
    //         arr[j + 1] = key;
    //     }
    // }
    // public static void main(String[] args) {
    //             int arr[] = { 2, 4, 1, 3, 8, 5, 9, 11 };
    //             insertionSort(arr);
    //             printArr(arr);
        
    //         }

       // for each loop 
       static void printArr(int[] arr){
        for(int i : arr)
        System.out.println(i+ " ");
        System.out.println();
       }
       public static void main(String[] args) {
        int arr [] ={5,1,2,3,4,8,9,6,5,7,4,3};
        Arrays.sort(arr);
        printArr(arr);
        System.out.println(arr[arr.length-1]);

       }
        }
     

