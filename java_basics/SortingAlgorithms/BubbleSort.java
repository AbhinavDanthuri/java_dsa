public class BubbleSort {
    public static void main(String args[]){
        int[] arr={8,6,4,2,9,5};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                //here firstly we use
                //i)j<arr.length but we should not check the last element we use arr.length-1
                //i)but for more efficieny we use arr.length-i-1
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        for(int num:arr){
            System.out.print(num);
        }
    }

}
