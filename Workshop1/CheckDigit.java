public class CheckDigit {

    static boolean isDigit(String str){

        for(int i = 0; i < str.length(); i++){

            if(!Character.isDigit(str.charAt(i))){
                return false;   // if any character is not digit
            }
        }
        return true;   // all are digits
    }

    public static void main(String[] args){

        System.out.println(isDigit("12345"));   // true
        System.out.println(isDigit("12a45"));   // false
        System.out.println(isDigit("9876"));    // true
    }
}