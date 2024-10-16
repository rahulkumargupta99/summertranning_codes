import java.util.Scanner;

public class JavaBasic {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("enter your number");
         
        a= sc.nextInt();
        b= sc.nextInt();
       
        int  sum =a+b;
        System.out.println(sum);
        
       
    }
}

