import java.util.*;
public class ArrayLists {
    public static void main(String[] args) {
        // ArrayList<Integer> arr = new ArrayList();
      // add element
    //     arr.add(10);
    //     arr.add(20);
    //     arr.add(30);
    //     arr.add(50);
    //     arr.add(60);
    //     arr.add(3,40);
    //     // Access an Element
    //     arr.get(1);
    //     // remove an element
    //     arr.remove(1);

    //   // update an element
    //     arr.set(1,100);
    //     arr.set(2,arr.get(2)+10);
    //     //size an element
    //     arr.size();
    //    // Sort
    //    Collections.sort(arr);
    //     System.out.print(arr);


    // 1.Take the size of an arraylist as an input :n
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    // take the element as an input
    ArrayList<Integer> arr = new ArrayList<>(n);
    for(int i=0; i<n; i++){
        arr.add(sc.nextInt());
    }
    // sort the arraylist
    Collections.sort(arr);
    // sum of the arraylist
    int sum=0;
    for(int num : arr)
    sum+=num;
    // smallest and largest number in your arraylist
    // average of the whole arraylist
    // make another arraylist of type string
    // take a sentance as input, and store 
    //


    

   
 
    
        
    }
}
