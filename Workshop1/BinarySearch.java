public class BinarySearch{
    static void search(int[] arr,int key){
        int left=0;
        int right=(arr.length)-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(key==arr[mid]){
                System.out.println("the element found  at index" + mid);
                return;
            }
            else if(arr[mid]<key){
                left=mid+1;
            }
            else
                right=mid-1;
        }
    
     System.out.println("the element not found ");
}
 public static void main(String[] args) {

        int[] arr = {2,4,6,8,10,12,14};
        search(arr, 14);
    }
}