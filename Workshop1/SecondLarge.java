public class SecondLarge{
    
    static void find(int[] nums){
         int max=Integer.MIN_VALUE; 
         int min=Integer.MIN_VALUE; 
            
        for(int i=0;i<nums.length;i++){

           //int first=nums[0];
         //int second=nums[0]; 

        if(nums[i]>max){
            min=max;
        max=nums[i];
        //second=first;
        
    }  
     else if(nums[i] > min && nums[i] != max) {
                min = nums[i];
            }
}
System.out.println("the second largest number is "+min);
System.out.println("the second largest number is "+max);

    }



public static void main(String args[]){
    find(new int[]{10, 5, 8, 7,90,5,46,});
     
}
    }