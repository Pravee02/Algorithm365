public class Palindrome {
  static boolean  isPalindrome(String name){

        int left = 0;
        int right = name.length() - 1;

        while(left < right){

            if(name.charAt(left) != name.charAt(right)){
                return false;
            }

            left++;   // increment first
            right--;     // decrement last
        }

        return true;
    }

    public static void main(String[] args){

        System.out.println(isPalindrome("madam")); // true
        System.out.println(isPalindrome("hello")); // false
    }
}