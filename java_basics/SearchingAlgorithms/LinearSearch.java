


public class LinearSearch {
    public static void main(String args[]){
        int arr[]={2,4,1,5,6};
        int target=5;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
                break;//stop once found
            }
        }
        if(index!=-1){
            System.out.println("element found at index"+index);
        }
        else{
            System.out.println("not found");
        }
    }
}

//
//with function
//        static int search(int arr[],target){
//    for(int i=0;i<arr.length;i++){
//        if(arr[i]==target){
//            return i;
//        }
//    }
//    return -1;
//        }
//
//void main() {
//    int arr[]={3,4,5,6,6};
//    int result=search(arr[],5);
//    if(result!=-1){
//        ......
//    }
//}