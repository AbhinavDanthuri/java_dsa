public class BinarySearch {
    public static void main(String args[]){
        int arr[]={2,7,6,1,4,5};
        int low=0,high=arr.length-1;
        int target=6;//time complexity O(log n)

        while(low<=high){
            int  mid=low+(high-low)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println("element not found");

    }
}
