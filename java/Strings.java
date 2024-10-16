public class Strings {

    // static boolean isPallindrome(String s1) {
    // int i = 0, j = s1.length() - 1;
    // while (i < j)
    // if (s1.charAt(i++) != s1.charAt(j--))
    // return false;
    // return true;
    // }
    // public static void main(String[] args) {

    // String s1 = "TabaT";
    // System.out.println(isPallindrome(s1));
    // }

    // find longest good string

    // public static void String(String s) {
    // for (int i = 0; i < s.length() - 1; i++) {
    // for (int j = i + 1; j <= s.length(); j++) {
    // System.out.println(s.substring(i, j));
    // }
    // }
    // }

    // public static void main(String[] args) {
    // String s = "Arrays";
    // String(s);
    // }

    // reverse this string is sky of blue color

    // Method to reverse the words in a string
    public static String reverse(String s) {
        s = s.trim();
        String[] arr = s.split("\\s+");
        String ans = " ";

        for (int i = arr.length - 1; i >= 0; i--) {
            ans += arr[i] + " ";
        }
        return ans.trim();
    }
    public static void main(String[] args) {
        String s = "The Class is Sleepy today";
        System.out.println(reverse(s));
    }
}
