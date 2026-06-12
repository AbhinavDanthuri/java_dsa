public class ReverseAString {
public static void main(String args[]){
    String s="abhinav";
    //method 1
//    String rev=" ";
//    for(int i=s.length()-1;i>=0;i--){
//        rev+=s.charAt(i)
//;    }
//    System.out.println(rev);

    //method 2 using string builder
//    String rev=new StringBuilder(s).reverse().toString();
//    System.out.println(rev);
   // here we use tostring because after reverseing it is still stringbuilder object so to make it string we use tostring

    //method 3 using two pointer
    char[] arr=s.toCharArray();//we are making it character array['a','b'] like that
    int left=0,right=arr.length-1;
    while(left<right){
        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
    }
    System.out.println(new String(arr));
}
}
