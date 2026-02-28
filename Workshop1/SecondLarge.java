public class SecondLarge{
    
    static void find(int[] nums){
         int max=Integer.MIN_VALUE; 
         int min=Integer.MIN_VALUE; 
            
        for(int i=0;i<nums.length;i++){

           //int first=nums[0];
         //int second=nums[0]; 

        if(nums[i]>max){
            
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


static void Secondl(int[] num){
    int firstlargest=num[0];
     int SecondLargest=Integer.MIN_VALUE;;
     for(int i=0;i<=num.length-1;i++){
if(num[i]>firstlargest){
    firstlargest=num[i];
}
if(num[i]<firstlargest&&num[i]>=SecondLargest){
    SecondLargest=num[i];
    
}

     }
     System.out.println("the second largest number is "+SecondLargest);
System.out.println("the second largest number is "+firstlargest);
}


public static void main(String args[]){
    find(new int[]{100, 5, 8, 7,90,5,46,95});
     Secondl(new int[]{100, 5, 8, 7,90,5,46,1000,999});
}
    }