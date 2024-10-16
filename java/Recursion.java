public class Recursion {

    //facrorial-----
    // static int factorial(int n){
    //     if(n==1) return 1;
    //     int fact = n*factorial(n-1);
    //     return fact;
    // }
    // public static void main(String[] args) {
    //     int n =5;
    //     System.out.println(factorial(n));
    // }
    //=============power function//

    // static int powerFunction(int x, int p){
    //     if(p==0) return 1;
    //     int ans =x*powerFunction(x, p-1);
    //     return ans;
       
    // }
    // public static void main(String[] args) {
    //     int n= 5;
    //     System.out.print(powerFunction(2, 4));
    // }

    //Factorial using tail recursion//
    // static int fact2(int n, int ans){
    //     if(n==0) return ans;
    //     return fact2(n-1, ans*n);
    // }
    // public static void main (String [] args){
    //     int n=5;
    //     System.out.print(fact2(4,1)); 
    // }

    //------Fibonacci series
    // static int fib(int n){
    //     if(n==0 || n==1) return n;
    //     return fib(n-1) + fib(n-2);
    // }
    // public static void main(String[] args) {
    //     int n =5;
    //     System.out.print(fib(1)); 
    // }

    //---Subsequence-----
    // static void subSeq(String s, String ans){
    //      if(s.isEmpty()){
    //         System.out.println(ans);
    //         return;
    //      }
    //      char ch =s.charAt(0);
    //      subSeq(s.substring(1),ans+ch);
    //      subSeq(s.substring(1),ans);

    // }
    // public static void main(String[] args) {
    //     int n =5;
    //     subSeq("CAR", "");
        // System.out.print()
    // }

    //print all outcome of a coin flip
    // static void coinFlip(int n, String ans){
    //     if(n==0){
    //         System.out.println(ans);
    //         return;
    //     }
    //     coinFlip(n-1, ans+"H");
    //     coinFlip(n-1, ans+"T");
    // }
    // public static void main(String[] args) {
    //     coinFlip(3, "");
    // }

    //-----------------------------google---------
     static void gp(int n, int open, int close, String ans){
        if(open==n && close==n){
            System.out.print(ans+ " , ");
            return;
        }
            if(open>n || close>open)
            return;
            gp(n,open+1,close, ans+ "(");
            gp(n,open,close+1, ans+ ")");
        }
        public static void main(String[]args){
        int n =5;
        gp(3, 0, 0, "");
     
    }
}
