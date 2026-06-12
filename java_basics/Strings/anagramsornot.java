public class anagramsornot {
public static void main(String args[]){
    String s1="abhinav";
    String s2="vanihba";

    if(s1.length()!=s2.length()){
        System.out.println("no output");
        return;
    }
    char[] arr1=s1.toCharArray();
    char[] arr2=s2.toCharArray();
    bubbles(arr1);
    bubbles(arr2);
    for(int i=0;i<arr1.length;i++){
        if(arr1[i]!=arr2[i]){
            System.out.println("not matching");
            return;
        }
    }
    System.out.println("it is matching");
}

public static void bubbles(char[] arr){
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                char temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }

    }
}
}


//predefined values code
//import java.util.Arrays;
//
//public static boolean isAnagram(String a, String b) {
//    if (a.length() != b.length()) return false;
//
//    char[] arr1 = a.toCharArray();
//    char[] arr2 = b.toCharArray();
//    Arrays.sort(arr1);  // "listen" -> "eilnst"
//    Arrays.sort(arr2);  // "silent" -> "eilnst"
//
//    return Arrays.equals(arr1, arr2);
//}
