public class Findmaxmin{
    static void findmaxmin(int[] nums){
    int max=nums[0];
    int min=nums[0];
    for(int i=1;i<nums.length;i++){
        if(nums[i]>max){
            max=nums[i];
        }
        if (nums[i]<min){
            min=nums[i];
        }
    }
         System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    
    } 
 public static void main(String[] args){
findmaxmin(new int[] {1,2,0,10});
    
    }
}


