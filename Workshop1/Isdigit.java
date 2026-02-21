public class Isdigit {

    static boolean isNumber(String input)
    {
        boolean result = true;  

        for (int i = 0; i < input.length(); i++) // FIXED
        {
            char character = input.charAt(i);

            if (character < '0' || character > '9')
            {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(isNumber("12345")); // true
        System.out.println(isNumber("12a45")); // false
    }
}