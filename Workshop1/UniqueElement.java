public class UniqueElement {

    static void PrintUnique(int[] num) {

        for (int i = 0; i < num.length; i++) {
            int count = 0;

            for (int j = 0; j < num.length; j++) {
                if (num[i] == num[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.print(num[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        PrintUnique(new int[]{1,2,5,1,8,5});
    }
}