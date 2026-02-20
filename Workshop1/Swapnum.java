public class Swapnum{
    static void swap(int num1,int num2){
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println(num1+" "+num2);
    }
    static void swap2(int[] numbers){
        int temp=numbers[0];
        numbers[0]=numbers[1];
        numbers[1]=temp;
        System.out.println(numbers[0]+" "+numbers[1]);
    }
    static void getswap()
    {
        int[] inputs={1,2};
        swap2(inputs);
        System.out.println(inputs[0]+" "+inputs[1]);
    }
    public static void main(String args[]){
        swap(10,20);
        getswap();
        swap2(new int[] {30,20});
       
    }
}