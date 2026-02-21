public class Palindrome {
  static boolean  isPalindrome(String name){
   boolean result=true;
        int left = 0;
        int right = name.length() - 1;

        while(left < right){

            if(name.charAt(left) != name.charAt(right)){
                result= false;
                  break; 
            }

            left++;   // increment first
            right--;     // decrement last
        }

        return result;
    }

    public static void main(String[] args){

        System.out.println(isPalindrome("madam")); // true
        System.out.println(isPalindrome("hello")); // false
    }
}
