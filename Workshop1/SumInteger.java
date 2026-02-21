class SumInteger {
    
    static void getsum(int[] num){
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
            int result=sum; 
        }
            System.out.println("sum is"+sum);   
        

    }
    public static void main(String args[]){
        getsum(new int[] {1,2,3,5});

        //int inpput []={1,2,3,4};
        //getsum(inpput);
    }
}